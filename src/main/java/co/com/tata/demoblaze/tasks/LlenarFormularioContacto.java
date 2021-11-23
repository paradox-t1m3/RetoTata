package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.model.DemoblazeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.tata.demoblaze.userinterface.FormularioContactoPage.*;
import static co.com.tata.demoblaze.util.Constantes.RESPUESTA_ENVIO_FORMULARIO_DE_CONTACTO;

public class LlenarFormularioContacto implements Task {

    private List<DemoblazeData> demoblazeData;

    public LlenarFormularioContacto(List<DemoblazeData> demoblazeData) {
        this.demoblazeData = demoblazeData;
    }

    public static LlenarFormularioContacto deDemoblaze(List<DemoblazeData> demoblazeData) {
        return Tasks.instrumented(LlenarFormularioContacto.class, demoblazeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(demoblazeData.get(0).getEmailContacto()).into(CONTACTO_EMAIL).thenHit(Keys.ENTER),
                Enter.theValue(demoblazeData.get(0).getNombreContacto()).into(CONTACTO_NOMBRE).thenHit(Keys.ENTER),
                Enter.theValue(demoblazeData.get(0).getMensaje()).into(CONTACTO_MENSAJE).thenHit(Keys.ENTER),
                Click.on(BOTON_SEND_MENSSAGE)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mensajeFormulario = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        actor.remember(RESPUESTA_ENVIO_FORMULARIO_DE_CONTACTO, mensajeFormulario);


    }
}
