package tasks.flujos.pagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.portalPagos.pagosPage.BTN_CUOTAS;

public class seleccionarCuotasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CUOTAS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_CUOTAS)
        );
    }

    public static seleccionarCuotasTask cuotas(String ncuotas){
        return instrumented(seleccionarCuotasTask.class,ncuotas);
    }
}
