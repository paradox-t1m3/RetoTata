package co.com.tata.demoblaze.exceptions;

public class RegistroDeUsuarioIncorrecto extends AssertionError {
    public static final String REGISTRO_DE_USUARIO_INCORRECTO = "ERROR: El usuario a registrar ya existe o es incorrecto";

    public RegistroDeUsuarioIncorrecto(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
