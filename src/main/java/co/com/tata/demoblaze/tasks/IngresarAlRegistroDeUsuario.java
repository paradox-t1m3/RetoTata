package co.com.tata.demoblaze.tasks;

import co.com.tata.demoblaze.interactions.SeleccionarLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.tata.demoblaze.userinterface.HomePage.LISTA_MENU_PAGINA;
import static co.com.tata.demoblaze.util.Constantes.OPCION_MENU_REGISTRAR_USUARIO;

public class IngresarAlRegistroDeUsuario implements Task {

    public static IngresarAlRegistroDeUsuario deLaPagina() {
        return Tasks.instrumented(IngresarAlRegistroDeUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarLista.desde(LISTA_MENU_PAGINA, OPCION_MENU_REGISTRAR_USUARIO)
        );
    }
}
