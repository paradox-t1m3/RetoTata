package co.com.tata.demoblaze.questions;

import co.com.tata.demoblaze.exceptions.RegistroDeUsuarioIncorrecto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tata.demoblaze.exceptions.RegistroDeUsuarioIncorrecto.REGISTRO_DE_USUARIO_INCORRECTO;
import static co.com.tata.demoblaze.util.Constantes.*;

public class VerificarRegistroDeUsuarioExitoso implements Question<Boolean> {

    public static VerificarRegistroDeUsuarioExitoso enMensajeEmergente() {
        return new VerificarRegistroDeUsuarioExitoso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String respuestaMensajeRegistro = actor.recall(RESPUESTA_USUARIO_REGISTRADO);

        boolean respuesta = false;

        if (respuestaMensajeRegistro.trim().equals(MENSAJE_USUARIO_REGISTRADOS_EXITOSAMENTE)) {
            respuesta = true;
        } else if (respuestaMensajeRegistro.trim().equals(MENSAJE_USUARIO_YA_REGISTRADO)) {
                throw new RegistroDeUsuarioIncorrecto(REGISTRO_DE_USUARIO_INCORRECTO);
        }

        return respuesta;
    }
}
