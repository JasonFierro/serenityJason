package tasks.flujos.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import tasks.flujos.ingresar.accederLoginTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.home.homePage.LOGO_PRIXZ;

public class logoPrixzTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGO_PRIXZ)
        );
    }

    public static logoPrixzTask clickLogoPrixz() {
        return instrumented(logoPrixzTask.class);
    }
}
