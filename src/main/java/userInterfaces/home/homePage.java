package userInterfaces.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class homePage extends PageObject {

    public static final Target BTN_INGRESAR = Target.the("Link boton ingresar").located(By.xpath("//span[@class='account-label-ingresa']"));
    public static final Target LOGO_PRIXZ = Target.the("Logo Prixz").located(By.cssSelector("[href='https://prixz.com']"));
    public static final Target LABEL_DESTACADOS = Target.the("Texto destacados").located(By.xpath("//h3[.='Destacados']"));
    public static final Target ADD_CARD_ONE = Target.the("Producto uno").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO = Target.the("Producto dos").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[2]/div/button"));
    public static final Target BTN_PLUS = Target.the("Aumentar producto desde el +").located(By.xpath("//div[@class='cfw-quantity-stepper-btn-plus ']"));
    public static final Target BTN_MINUS = Target.the("Disminuir producto desde el -").located(By.xpath("//div[@class='cfw-quantity-stepper-btn-minus']"));
    public static final Target BTN_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando").located(By.xpath("//a[contains(.,'Seguir comprando')]"));
    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Boton finalizar compra").located(By.xpath("//a[contains(.,'Finalizar compra')]"));

}
