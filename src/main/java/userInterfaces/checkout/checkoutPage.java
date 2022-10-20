package userInterfaces.checkout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class checkoutPage extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_APELLIDO = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_DIRECCION = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_EXTERIOR = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_INTERIOR = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_COLONIA = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Input nombre checkout").located(By.id("billing_first_name"));
}
