package tasks;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.bookStorePage.*;

public class pantallaBookStoreTask implements Task {

    private String user;
    private String password;

    public pantallaBookStoreTask(String user, String password){
        this.user = user;
        this.password = password;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HPV_LOGIN),
                WaitUntil.the(HPV_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(HPV_LOGIN),
                WaitUntil.the(INPUT_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(user).into(INPUT_USER),
                SendKeys.of(password).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN));
    }

    public static pantallaBookStoreTask ingresarLogin(String user, String password) {
        return instrumented(pantallaBookStoreTask.class, user, password);
    }


}
