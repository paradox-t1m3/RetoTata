package co.com.tata.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdicionarProductoPage {
    public static final Target ADICIONAR_PRODUCTO = Target.the("Adicionar producto").located(By.xpath("//a[text()='Add to cart']"));

}
