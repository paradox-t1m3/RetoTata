package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.tata.demoblaze.userinterface.HomePage.INDICATIVO_HOME;
import static co.com.tata.demoblaze.util.Constantes.TEXTO_INDICATIVO_HOME;

public class IngresarAHome implements Task {

    public static IngresarAHome enLaPagina() {
        return Tasks.instrumented(IngresarAHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Visibility.of(INDICATIVO_HOME).viewedBy(actor).asBoolean() &&
                Text.of(INDICATIVO_HOME).viewedBy(actor).asString().trim().equals(TEXTO_INDICATIVO_HOME)) {
            actor.attemptsTo(Scroll.to(INDICATIVO_HOME));

        } else {
            actor.attemptsTo(
                    Click.on(HomePage.OPCION_MENU_HOME)
            );
        }
    }
}
