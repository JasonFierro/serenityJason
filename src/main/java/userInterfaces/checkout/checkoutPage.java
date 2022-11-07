package userInterfaces.checkout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class checkoutPage extends PageObject {

    private static String seleccionarEstado;

    public static final Target LABEL_NOMBRE = Target.the("Label de bienvenido de nuevo").located(By.cssSelector(".cfw-have-acc-text > strong"));
    public static final Target INPUT_EMAIL = Target.the("Input email checkout").located(By.id("billing_email"));
    public static final Target INPUT_NOMBRE = Target.the("Input nombre checkout").located(By.xpath("//input[@id='billing_first_name']"));
    public static final Target INPUT_APELLIDO = Target.the("Input nombre checkout").located(By.xpath("//input[@id='billing_last_name']"));
    public static final Target INPUT_DIRECCION = Target.the("Input direccion checkout").located(By.cssSelector("[placeholder='Dirección de la calle']"));
    public static final Target INPUT_EXTERIOR = Target.the("Input exterior checkout").located(By.cssSelector("[placeholder='No exterior']"));
    public static final Target INPUT_INTERIOR = Target.the("Input interior checkout").located(By.cssSelector("[placeholder='No interior (opcional)']"));
    public static final Target INPUT_COLONIA = Target.the("Input colonia checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Input CP checkout").located(By.cssSelector("#billing_postcode"));
    public static final Target INPUT_ESTADO = Target.the("Input estado checkout").located(By.xpath("//option[.='Ciudad de México']"));
    //public static final Target INPUT_ESTADO = Target.the("Input estado checkout").located(By.xpath("//option[.='"+ DatosCheckoutTask.datosCheckoutEstado() +"']"));
    public static final Target INPUT_CIUDAD = Target.the("Input estado checkout").located(By.xpath("//input[@id='billing_city']"));
    public static final Target INPUT_TELEFONO = Target.the("Ingreso telefono").located(By.xpath("//input[@id='billing_phone']"));
    public static final Target BTN_CONTINUAR_COMPRA = Target.the("Boton continuar compra").located(By.xpath("//button[@id='place_order']"));
}
