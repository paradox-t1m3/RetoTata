package co.com.tata.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tata.demoblaze.util.Constantes.MENSAJE_PRODUCTO_AGREGADO;
import static co.com.tata.demoblaze.util.Constantes.RESPUESTA_ADICION_DE_PRODUCTO;

public class VerificarAdicionDeProducto implements Question<Boolean> {

    public static VerificarAdicionDeProducto deContacto() {
        return new VerificarAdicionDeProducto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String respuestaMensajeAdicionDeProducto = actor.recall(RESPUESTA_ADICION_DE_PRODUCTO);

        if (respuestaMensajeAdicionDeProducto.trim().equals(MENSAJE_PRODUCTO_AGREGADO)) {
            respuesta = true;
        }

        return respuesta;
    }
}
