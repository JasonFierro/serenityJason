package userInterfaces.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Ingresar usuario").located(By.xpath("//input[@id='username']"));
    public static final Target INPUT_CONTRASENA = Target.the("Ingresar contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCEDER = Target.the("Boton Acceder").located(By.xpath("//button[@name='login']"));
}
