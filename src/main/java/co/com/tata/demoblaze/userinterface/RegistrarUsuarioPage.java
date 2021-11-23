package co.com.tata.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarUsuarioPage {
    public static final Target NOMBRE_DE_USUARIO_REGISTRO = Target.the("Nombre de usuario de registro").located(By.xpath("//input[@id='sign-username']"));
    public static final Target CLAVE_REGISTRO = Target.the("Clave de registro").located(By.xpath("//input[@id='sign-password']"));
    public static final Target BOTON_SIGN_UP = Target.the("Boton registrar").located(By.xpath("//button[text()='Sign up']"));
}
