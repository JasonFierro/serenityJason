package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class bookStorePage extends PageObject {

    public static final Target HPV_LOGIN = Target.the("Hipervinculo login").located(By.xpath("//span[.='Login']"));
    public static final Target HPV_BOOK_STORE = Target.the("Hipervinculo Book Store").located(By.xpath("//span[.='Book Store']"));
    public static final Target INPUT_USER = Target.the("Entrada de texto usuario").located(By.xpath("//input[@id='userName']"));
    public static final Target LABEL_USER = Target.the("Texto usuario").located(By.id("userName-label"));
    public static final Target INPUT_PASSWORD = Target.the("Entrada de texto contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target LABEL_PASSWORD = Target.the("Texto contraseña").located(By.xpath("//label[@id='password-label']"));
    public static final Target BTN_LOGIN = Target.the("Boton login").located(By.xpath("//button[@id='login']"));
}
