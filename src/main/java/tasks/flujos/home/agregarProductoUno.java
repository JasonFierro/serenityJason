package tasks.flujos.home;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.*;
import static userInterfaces.bookStorePage.*;
import static userInterfaces.home.homePage.*;

public class agregarProductoUno implements Task {

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        Thread.sleep(5000);
        actor.attemptsTo(
                Scroll.to(LABEL_DESTACADOS),
                WaitUntil.the(ADD_CARD_ONE, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ADD_CARD_ONE)
        );
        Thread.sleep(3000);
        actor.attemptsTo(
                WaitUntil.the(BTN_SEGUIR_COMPRANDO, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SEGUIR_COMPRANDO)
        );
        // Bug con los productos sin stock cuando se da el -, sale el mensaje que no tienen, deberia ser con el +
//        actor.attemptsTo(
//                WaitUntil.the(BTN_PLUS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(BTN_PLUS)
//        );
    }

    public static agregarProductoUno agregarProductoUno() {
        return instrumented(agregarProductoUno.class);
    }

}
