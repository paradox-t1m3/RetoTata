package co.com.tata.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static co.com.tata.demoblaze.util.Constantes.URL_DEMOBLAZE;

@DefaultUrl(URL_DEMOBLAZE)
public class HomePage extends PageObject {
    public static final Target LISTA_MENU_PAGINA = Target.the("Lista menu pagina").located(By.xpath("//div[@id='navbarExample']/ul/li/a"));
    public static final Target USUARIO_INICIO_DE_SESION = Target.the("Nombre de usuario al inciar sesion").located(By.xpath("//a[@id='nameofuser']"));
    public static final Target LISTA_SELECCIONAR_CATEGORIA = Target.the("Seleccionar categoria de producto").located(By.xpath("//a[@id='itemc']"));
    public static final Target INDICATIVO_HOME = Target.the("Indicar si se esta en el home").located(By.xpath("//a[@id='cat']"));
    public static final Target OPCION_MENU_HOME = Target.the("Seleccionar opcion home del menu").located(By.xpath("//div[@id='navbarExample']/ul/li/a[text()='Home ']"));
    public static final Target PRODUCTO_MACBOOK_PRO = Target.the("Seleccionar producto MacBookPro").located(By.xpath("//a[text()='MacBook Pro']"));
    public static final Target SELECCIONAR_LAPTOP = Target.the("laptops").located(By.xpath("//a[@id='itemc' and text()='Laptops']']"));
    public static final Target SELECCIONAR_PAGINA_SIGUIENTE_CATEGORIA = Target.the("laptops").located(By.xpath("//button[@id='next2']"));

}
