package tasks.flujos.cuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import tasks.flujos.ingresar.accederLoginTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class validarCuentaTask implements Task {

    private String pedidos;
    private String direcciones;
    private String datos;
    private String inicio;
    private String lealtad;
    private String salir;

    public validarCuentaTask(String pedidos, String direcciones,String datos,String inicio,String lealtad,String salir){
        this.pedidos = pedidos;
        this.direcciones = direcciones;
        this.datos = datos;
        this.inicio = inicio;
        this.lealtad = lealtad;
        this.salir = salir;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }

    public static validarCuentaTask validarCuenta(String pedidos, String direcciones,String datos, String inicio,String lealtad, String salir) {
        return instrumented(validarCuentaTask.class, pedidos, direcciones, datos, inicio, lealtad, salir);
    }
}
