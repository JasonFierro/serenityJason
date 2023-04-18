package tasks.flujos.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.home.homePage.*;

public class compraDirectaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRITO_COMPRAS),
                Click.on(BTN_FINALIZAR_COMPRA)
        );
        BrowseTheWeb.as(actor).getAlert().accept();
    }

    public static compraDirectaTask finalizarCompra(){
        return instrumented(compraDirectaTask.class);
    }
}
