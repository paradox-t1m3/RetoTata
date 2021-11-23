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

import static co.com.tata.demoblaze.userinterface.RegistrarUsuarioPage.*;
import static co.com.tata.demoblaze.util.Constantes.RESPUESTA_USUARIO_REGISTRADO;


public class RegistrarUsuario implements Task {

    private List<DemoblazeData> demoblazeData;

    public RegistrarUsuario(List<DemoblazeData> demoblazeData) {
        this.demoblazeData = demoblazeData;
    }

    public static RegistrarUsuario enDemoblaze(List<DemoblazeData> demoblazeData) {
        return Tasks.instrumented(RegistrarUsuario.class, demoblazeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(demoblazeData.get(0).getUsuarioRegistro()).into(NOMBRE_DE_USUARIO_REGISTRO).thenHit(Keys.ENTER),
                Enter.theValue(demoblazeData.get(0).getClaveRegistro()).into(CLAVE_REGISTRO).thenHit(Keys.ENTER),
                Click.on(BOTON_SIGN_UP)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mensaje = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        actor.remember(RESPUESTA_USUARIO_REGISTRADO, mensaje);
    }
}
