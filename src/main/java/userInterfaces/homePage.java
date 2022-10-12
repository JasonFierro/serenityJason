package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class homePage extends PageObject {

    public static final Target BTN_BOOK_STORE = Target.the("Link boton book store").located(By.xpath("//h5[.='Book Store Application']"));

}
