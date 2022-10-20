package tasks.flujos.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.home.homePage.*;

public class agregarProductoDos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LABEL_DESTACADOS),
                WaitUntil.the(ADD_CARD_TWO, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ADD_CARD_TWO),
                WaitUntil.the(BTN_FINALIZAR_COMPRA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_FINALIZAR_COMPRA)
        );
    }

    public static agregarProductoDos agregarProductoDos() {
        return instrumented(agregarProductoDos.class);
    }
}
