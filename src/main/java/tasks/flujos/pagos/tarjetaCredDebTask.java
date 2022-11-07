package tasks.flujos.pagos;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.portalPagos.pagosPage.*;
import static userInterfaces.portalPagos.pagosPage.INPUT_CVV;

public class tarjetaCredDebTask implements Task {

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        Thread.sleep(3000);
        actor.attemptsTo(
                WaitUntil.the(BTN_TARJETA_DEB_CRED, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_TARJETA_DEB_CRED)
        );
    }

    public static tarjetaCredDebTask tarjetaCredDeb(){
        return instrumented(tarjetaCredDebTask.class);
    }
}
