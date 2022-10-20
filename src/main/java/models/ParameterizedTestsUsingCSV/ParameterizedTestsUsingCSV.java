//package models.ParameterizedTestsUsingCSV;
//
//import net.serenitybdd.core.Serenity;
//import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Open;
//import net.serenitybdd.screenplay.actions.Scroll;
//import net.serenitybdd.screenplay.actions.SendKeys;
//import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
//import net.serenitybdd.screenplay.waits.WaitUntil;
//import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.annotations.Title;
//import net.thucydides.junit.annotations.Qualifier;
//import net.thucydides.junit.annotations.TestData;
//import net.thucydides.junit.annotations.UseTestDataFrom;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import tasks.pantallaBookStoreTask;
//import userInterfaces.bookStorePage;
//import userInterfaces.home.homePage;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = "src/test/resources/credentials.csv")
//public class ParameterizedTestsUsingCSV {
//
//    public String username;
//    public String password;
//    public String message;
//    private homePage home = new homePage();
//
//    @Managed(driver = "chrome")
//    private WebDriver navegador;
//
//
//    @TestData(columnNames = "username, password, message")
//
//    @Qualifier
//    public String qualifier() {
//        return " - " + " Usuario = " + username + " y " + " contraseña = " + password + " should display " + message;
//    }
//
//    @Test
//    @Title("Login to application with invalid credential generates error message")
//    public void unsuccessfulLogin() {
//        Actor actor = Actor.named("Jason");
//        // Given
//        actor.can(BrowseTheWeb.with(navegador));
//        actor.wasAbleTo(Open.browserOn(home));
//
//        // When
//        actor.attemptsTo(Scroll.to(homePage.BTN_BOOK_STORE),
//                Click.on(homePage.BTN_BOOK_STORE));
//        actor.attemptsTo(Scroll.to(bookStorePage.HPV_LOGIN),
//                WaitUntil.the(bookStorePage.HPV_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(bookStorePage.HPV_LOGIN),
//                WaitUntil.the(bookStorePage.INPUT_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
//                SendKeys.of(username).into(bookStorePage.INPUT_USER),
//                SendKeys.of(password).into(bookStorePage.INPUT_PASSWORD),
//                Click.on(bookStorePage.BTN_LOGIN));
//
////         Then
////        Serenity.reportThat("Passing invalid credentials generates error message",
////                () -> assertThat(loginPage.loginPageErrorMessage()).isEqualToIgnoringCase(errorMessage));
////    }
////
//    }
//}