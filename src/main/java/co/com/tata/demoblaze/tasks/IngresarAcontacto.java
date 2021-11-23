package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.interactions.SeleccionarLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.tata.demoblaze.userinterface.HomePage.LISTA_MENU_PAGINA;
import static co.com.tata.demoblaze.util.Constantes.OPCION_MENU_CONTACTO;

public class IngresarAcontacto implements Task {

    public static IngresarAcontacto deLaPagina() {
        return Tasks.instrumented(IngresarAcontacto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarLista.desde(LISTA_MENU_PAGINA, OPCION_MENU_CONTACTO)
        );
    }
}
