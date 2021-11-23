package co.com.tata.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tata.demoblaze.util.Constantes.MENSAJE_ENVIO_DE_FORMULARIO;
import static co.com.tata.demoblaze.util.Constantes.RESPUESTA_ENVIO_FORMULARIO_DE_CONTACTO;

public class VerificarEnvioDeFormulario implements Question<Boolean> {

    public static VerificarEnvioDeFormulario deContacto() {
        return new VerificarEnvioDeFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String respuestaMensajeEnvioDeFormulario = actor.recall(RESPUESTA_ENVIO_FORMULARIO_DE_CONTACTO);

        System.out.println(respuestaMensajeEnvioDeFormulario);

        if (respuestaMensajeEnvioDeFormulario.trim().equals(MENSAJE_ENVIO_DE_FORMULARIO)) {
            respuesta = true;
        }

        return respuesta;
    }
}
