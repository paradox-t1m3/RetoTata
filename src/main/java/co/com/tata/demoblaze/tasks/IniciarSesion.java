package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.model.DemoblazeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.tata.demoblaze.userinterface.IniciarSesionPage.*;
import static co.com.tata.demoblaze.util.Constantes.RECORDAR_USUARIO;

public class IniciarSesion implements Task {

    private List<DemoblazeData> demoblazeData;

    public IniciarSesion(List<DemoblazeData> demoblazeData) {
        this.demoblazeData = demoblazeData;
    }

    public static IniciarSesion enDemoblaze(List<DemoblazeData> demoblazeData) {
        return Tasks.instrumented(IniciarSesion.class, demoblazeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(demoblazeData.get(0).getUsuario()).into(NOMBRE_DE_USUARIO).thenHit(Keys.ENTER),
                Enter.theValue(demoblazeData.get(0).getClave()).into(CLAVE).thenHit(Keys.ENTER),
                Click.on(BOTON_LOG_IN)
        );

        actor.remember(RECORDAR_USUARIO, demoblazeData.get(0).getUsuario());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
