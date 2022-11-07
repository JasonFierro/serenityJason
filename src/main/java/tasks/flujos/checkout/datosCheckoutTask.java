package tasks.flujos.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static userInterfaces.checkout.checkoutPage.*;
import static userInterfaces.login.loginPage.*;
import static userInterfaces.portalPagos.pagosPage.BTN_PAGAR;

public class datosCheckoutTask implements Task {

    private String usuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String exterior;
    private String interior;
    private String postal;
    private String estado;
    private String ciudad;
    private String telefono;


    public datosCheckoutTask(String usuario, String nombre, String apellido, String direccion, String exterior, String interior, String postal, String estado, String ciudad, String telefono ){
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.exterior = exterior;
        this.interior = interior;
        this.postal = postal;
        this.estado = estado;
        System.out.println("*************Prueba de estado**************" + estado);
        this.ciudad = ciudad;
        this.telefono = telefono;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (LABEL_NOMBRE.isVisibleFor(actor)){
            actor.attemptsTo(
                    Clear.field(INPUT_NOMBRE),
                    SendKeys.of(nombre).into(INPUT_NOMBRE),
                    Clear.field(INPUT_APELLIDO),
                    SendKeys.of(apellido).into(INPUT_APELLIDO),
                    Clear.field(INPUT_DIRECCION),
                    SendKeys.of(direccion).into(INPUT_DIRECCION),
                    Clear.field(INPUT_EXTERIOR),
                    SendKeys.of(exterior).into(INPUT_EXTERIOR),
                    Clear.field(INPUT_INTERIOR),
                    SendKeys.of(interior).into(INPUT_INTERIOR),
                    Clear.field(INPUT_CODIGO_POSTAL),
                    SendKeys.of(postal).into(INPUT_CODIGO_POSTAL),
                    Click.on(INPUT_ESTADO),
                    Clear.field(INPUT_CIUDAD),
                    SendKeys.of(ciudad).into(INPUT_CIUDAD),
                    Clear.field(INPUT_TELEFONO),
                    SendKeys.of(telefono).into(INPUT_TELEFONO),
                    Click.on(BTN_CONTINUAR_COMPRA)
            );
        }else {
            actor.attemptsTo(
                    SendKeys.of(usuario).into(INPUT_EMAIL),
                    Clear.field(INPUT_NOMBRE),
                    SendKeys.of(nombre).into(INPUT_NOMBRE),
                    Clear.field(INPUT_APELLIDO),
                    SendKeys.of(apellido).into(INPUT_APELLIDO),
                    Clear.field(INPUT_DIRECCION),
                    SendKeys.of(direccion).into(INPUT_DIRECCION),
                    Clear.field(INPUT_EXTERIOR),
                    SendKeys.of(exterior).into(INPUT_EXTERIOR),
                    Clear.field(INPUT_INTERIOR),
                    SendKeys.of(interior).into(INPUT_INTERIOR),
                    Clear.field(INPUT_CODIGO_POSTAL),
                    SendKeys.of(postal).into(INPUT_CODIGO_POSTAL),
                    Click.on(INPUT_ESTADO),
                    Clear.field(INPUT_CIUDAD),
                    SendKeys.of(ciudad).into(INPUT_CIUDAD),
                    Clear.field(INPUT_TELEFONO),
                    SendKeys.of(telefono).into(INPUT_TELEFONO),
                    Click.on(BTN_CONTINUAR_COMPRA)
            );
        }
    }

    public static datosCheckoutTask datosCheckout(String usuario,String nombre, String apellido, String datos,
                                                  String exterior, String interior, String postal, String estado, String ciudad,
                                                  String telefono) {
        return instrumented(datosCheckoutTask.class, usuario, nombre, apellido, datos, exterior, interior, postal, estado,
                ciudad, telefono);
    }
}
