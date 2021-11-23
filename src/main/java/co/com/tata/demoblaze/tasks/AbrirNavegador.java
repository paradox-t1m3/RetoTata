package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.tata.demoblaze.userinterface.HomePage.INDICATIVO_HOME;
import static co.com.tata.demoblaze.util.Constantes.TEXTO_INDICATIVO_HOME;

public class AbrirNavegador implements Task {

    private HomePage homePage;

    public static AbrirNavegador enLaPagina() {
        return Tasks.instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));

        if (Visibility.of(INDICATIVO_HOME).viewedBy(actor).asBoolean() &&
                Text.of(INDICATIVO_HOME).viewedBy(actor).asString().trim().equals(TEXTO_INDICATIVO_HOME)) {
            actor.attemptsTo(Scroll.to(INDICATIVO_HOME));
        }
    }
}
