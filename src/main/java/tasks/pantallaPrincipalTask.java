package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static userInterfaces.home.homePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class pantallaPrincipalTask implements Task {

    public static pantallaPrincipalTask bookStore() {
        return instrumented(pantallaPrincipalTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_INGRESAR),
                Click.on(BTN_INGRESAR));
    }

}
