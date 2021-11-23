package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.interactions.SeleccionarLista;
import co.com.tata.demoblaze.model.DemoblazeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static co.com.tata.demoblaze.userinterface.HomePage.LISTA_SELECCIONAR_CATEGORIA;

public class SeleccionarCategoria implements Task {

    private List<DemoblazeData> demoblazeData;

    public SeleccionarCategoria(List<DemoblazeData> demoblazeData) {
        this.demoblazeData = demoblazeData;
    }

    public static IngresarAcontacto deLaPagina(List<DemoblazeData> demoblazeData) {
        return Tasks.instrumented(IngresarAcontacto.class, demoblazeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarLista.desde(LISTA_SELECCIONAR_CATEGORIA, demoblazeData.get(0).getCategoria())
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
