package userInterfaces.cuenta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class miCuentaPage extends PageObject {

    public static final Target LABEL_PEDIDOS = Target.the("Validar texto pedidos").located(By.xpath("//a[.='Tus pedidos']"));
    public static final Target LABEL_DIRECCIONES = Target.the("Validar texto direcciones").located(By.xpath("//a[.='Direcciones']"));
    public static final Target LABEL_DATOS = Target.the("Validar texto datos").located(By.xpath("//a[.='Mis datos']"));
    public static final Target LABEL_INICIO = Target.the("Validar texto inicio").located(By.xpath("//a[.='Inicio']"));
    public static final Target LABEL_LEALTAD = Target.the("Validar texto lealtad").located(By.xpath("//a[.='Programa de Lealtad']"));
    public static final Target LABEL_SALIR = Target.the("Validar texto salir").located(By.xpath("//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']/a[.='Salir']"));
}
