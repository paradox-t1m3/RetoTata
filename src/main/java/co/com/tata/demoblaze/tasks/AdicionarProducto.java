package co.com.tata.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tata.demoblaze.userinterface.AdicionarProductoPage.ADICIONAR_PRODUCTO;
import static co.com.tata.demoblaze.util.Constantes.RESPUESTA_ADICION_DE_PRODUCTO;

public class AdicionarProducto implements Task {

    public static AdicionarProducto deDomoblaze() {
        return Tasks.instrumented(AdicionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADICIONAR_PRODUCTO)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mensajeAdicionDeProducto = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        actor.remember(RESPUESTA_ADICION_DE_PRODUCTO, mensajeAdicionDeProducto);
    }
}
