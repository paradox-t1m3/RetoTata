package co.com.tata.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage {
    public static final Target NOMBRE_DE_USUARIO = Target.the("Nombre de usuario").located(By.id("loginusername"));
    public static final Target CLAVE = Target.the("Clave").located(By.id("loginpassword"));
    public static final Target BOTON_LOG_IN = Target.the("Boton inicio de sesion").located(By.xpath("//button[text()='Log in']"));

}
