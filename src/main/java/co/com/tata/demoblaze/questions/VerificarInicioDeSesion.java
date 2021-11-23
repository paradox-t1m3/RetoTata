package co.com.tata.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tata.demoblaze.userinterface.HomePage.USUARIO_INICIO_DE_SESION;
import static co.com.tata.demoblaze.util.Constantes.RECORDAR_USUARIO;
import static co.com.tata.demoblaze.util.Constantes.TEXTO_VERIFICAR_INICIO_DE_SESION;

public class VerificarInicioDeSesion implements Question<Boolean> {


    public static VerificarInicioDeSesion enLaPagina() {
        return new VerificarInicioDeSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String usuario = actor.recall(RECORDAR_USUARIO);
        boolean respuesta = false;

        if (Text.of(USUARIO_INICIO_DE_SESION).viewedBy(actor).asString().equals(TEXTO_VERIFICAR_INICIO_DE_SESION + usuario)) {
            respuesta = true;
        }

        return respuesta;
    }
}
