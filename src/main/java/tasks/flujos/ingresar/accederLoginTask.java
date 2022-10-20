package tasks.flujos.ingresar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.home.homePage.*;
import static userInterfaces.login.loginPage.*;

public class accederLoginTask implements Task {

    private String user;
    private String password;

    public accederLoginTask(String usuario, String contrasena){
        this.user = usuario;
        this.password = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                SendKeys.of(user).into(INPUT_USUARIO),
                SendKeys.of(password).into(INPUT_CONTRASENA),
                Click.on(BTN_ACCEDER)
//                SendKeys.of(password).into(INPUT_CONTRASENA),
//                Click.on(BTN_ACCEDER)
        );
    }

    public static accederLoginTask ingresarLogin(String user, String password) {
        return instrumented(accederLoginTask.class, user, password);
    }
}
