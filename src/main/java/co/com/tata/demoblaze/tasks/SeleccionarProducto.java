package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.model.DemoblazeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;

import static co.com.tata.demoblaze.userinterface.HomePage.PRODUCTO_MACBOOK_PRO;
import static co.com.tata.demoblaze.userinterface.HomePage.SELECCIONAR_PAGINA_SIGUIENTE_CATEGORIA;

public class SeleccionarProducto implements Task {

    private List<DemoblazeData> demoblazeData;

    public SeleccionarProducto(List<DemoblazeData> demoblazeData) {
        this.demoblazeData = demoblazeData;
    }

    public static SeleccionarProducto deLaPagina(List<DemoblazeData> demoblazeData) {
        return Tasks.instrumented(SeleccionarProducto.class, demoblazeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Visibility.of(PRODUCTO_MACBOOK_PRO).viewedBy(actor).asBoolean() &&
                Text.of(PRODUCTO_MACBOOK_PRO).viewedBy(actor).asString().equals(demoblazeData.get(0).getProducto())) {
            actor.attemptsTo(
                    Click.on(PRODUCTO_MACBOOK_PRO)
            );

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            while (!Visibility.of(PRODUCTO_MACBOOK_PRO).viewedBy(actor).asBoolean()) {
                actor.attemptsTo(Click.on(SELECCIONAR_PAGINA_SIGUIENTE_CATEGORIA));
                if (Visibility.of(PRODUCTO_MACBOOK_PRO).viewedBy(actor).asBoolean() &&
                        Text.of(PRODUCTO_MACBOOK_PRO).viewedBy(actor).asString().equals(demoblazeData.get(0).getProducto())) {
                    actor.attemptsTo(
                            Click.on(PRODUCTO_MACBOOK_PRO)
                    );
                    break;
                }
            }
        }
    }
}
