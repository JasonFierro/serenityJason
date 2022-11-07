package tasks.flujos.pagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.portalPagos.pagosPage.*;

public class pagosTask implements Task {

    private String tarjeta;
    private String vencimiento;
    private String titular;
    private String cvv;

    public pagosTask(String tarjeta, String vencimiento,String titular, String cvv){
        this.tarjeta = tarjeta;
        this.vencimiento = vencimiento;
        this.titular = titular;
        this.cvv = cvv;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_NUM_TARJETA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(tarjeta).into(INPUT_NUM_TARJETA),
                SendKeys.of(vencimiento).into(INPUT_VENCIMIENTO),
                SendKeys.of(titular).into(INPUT_TITULAR),
                SendKeys.of(cvv).into(INPUT_CVV),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static pagosTask pagos(String tarjeta, String vencimiento,String titular, String cvv){
        return instrumented(pagosTask.class,tarjeta,vencimiento,titular,cvv);
    }
}
