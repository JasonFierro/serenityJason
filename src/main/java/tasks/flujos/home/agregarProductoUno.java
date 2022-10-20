package tasks.flujos.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.bookStorePage.*;
import static userInterfaces.home.homePage.*;

public class agregarProductoUno implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LABEL_DESTACADOS),
                Click.on(ADD_CARD_ONE),
                WaitUntil.the(BTN_PLUS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_PLUS),
                WaitUntil.the(BTN_MINUS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_MINUS),
                WaitUntil.the(BTN_SEGUIR_COMPRANDO, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SEGUIR_COMPRANDO)
        );
    }

    public static agregarProductoUno agregarProductoUno() {
        return instrumented(agregarProductoUno.class);
    }

}
