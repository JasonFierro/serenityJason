package tasks.flujos.home;

import io.cucumber.java.en.Then;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.contains;
import static userInterfaces.home.homePage.*;

public class agregarProductoDos implements Task {

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LABEL_DESTACADOS),
                WaitUntil.the(ADD_CARD_TWO, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ADD_CARD_TWO)
        );
        Thread.sleep(3000);
        actor.attemptsTo(
                WaitUntil.the(BTN_FINALIZAR_COMPRA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_FINALIZAR_COMPRA)
        );
//        if (contains().matches(MENSAJE_ALERTA_STOCK_REFRIGERADO)){
//            actor.attemptsTo(
//                    Click.on(CARRITO_COMPRAS),
//                    WaitUntil.the(BTN_FINALIZAR_COMPRA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
//                    Click.on(BTN_FINALIZAR_COMPRA)
//            );
//        } else {
//            actor.attemptsTo(
//                    WaitUntil.the(BTN_FINALIZAR_COMPRA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
//                    Click.on(BTN_FINALIZAR_COMPRA)
//            );
//        }
    }

    public static agregarProductoDos agregarProductoDos() {
        return instrumented(agregarProductoDos.class);
    }
}
