package userInterfaces.portalPagos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class pagosPage extends PageObject {

    public static final Target BTN_TARJETA_DEB_CRED = Target.the("Selecciona tarjeta bedito o credito").located(By.cssSelector("[for='new_card_row'] > .group-media-object"));
    public static final Target INPUT_NUM_TARJETA = Target.the("Ingresar numero de tarjeta").located(By.id("card_number"));
    public static final Target INPUT_VENCIMIENTO = Target.the("Ingresar fecha de vencimiento").located(By.id("input_expiration_date"));
    public static final Target INPUT_TITULAR = Target.the("Ingresar titular").located(By.id("fullname"));
    public static final Target INPUT_CVV = Target.the("Ingresar CVV").located(By.id("cvv"));
    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar").located(By.xpath("//span[.='Continuar']"));
    public static final Target BTN_VOLVER = Target.the("Boton voler").located(By.xpath("//span[.='Volver']"));
    public static final Target BTN_CUOTAS = Target.the("Seleccionar Cuotas").located(By.cssSelector("[for='1'] > .installments-list"));
    public static final Target BTN_PAGAR = Target.the("Boton Pagar").located(By.xpath("//span[@class='andes-button__content']"));

}
