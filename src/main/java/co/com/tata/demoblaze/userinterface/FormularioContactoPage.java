package co.com.tata.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioContactoPage {
    public static final Target CONTACTO_EMAIL = Target.the("Email del contacto").located(By.xpath("//input[@id='recipient-email']"));
    public static final Target CONTACTO_NOMBRE = Target.the("Nombre del contacto").located(By.xpath("//input[@id='recipient-name']"));
    public static final Target CONTACTO_MENSAJE = Target.the("Mensaje para el contacto").located(By.xpath("//textarea[@id='message-text']"));
    public static final Target BOTON_SEND_MENSSAGE = Target.the("Boton inicio de sesion").located(By.xpath("//button[text()='Send message']"));

}
