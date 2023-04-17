package stepDefinitions.flujos;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ScreenRecorder.MyScreenRecorder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import userInterfaces.home.homePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static questions.cuenta.validarMiCuentaQtns.*;
import static questions.pagos.pagosQstn.validateTextPagar;
import static tasks.flujos.checkout.compraDirectaTask.finalizarCompra;
import static tasks.flujos.checkout.datosCheckoutTask.datosCheckout;
import static tasks.flujos.home.agregarProductoDos.agregarProductoDos;
import static tasks.flujos.home.agregarProductoUno.*;
import static tasks.flujos.home.logoPrixzTask.*;
import static tasks.flujos.ingresar.accederLoginTask.ingresarLogin;
import static tasks.flujos.pagos.pagosTask.pagos;
import static tasks.flujos.pagos.seleccionarCuotasTask.cuotas;
import static tasks.flujos.pagos.tarjetaCredDebTask.tarjetaCredDeb;

public class compraLoginTarjeta {

    @Before
    public void configuracionInicial() throws Exception {
        setTheStage(new OnlineCast());
    }

    @After
    public void TearDown() throws Exception {
        MyScreenRecorder.stopRecording();
    }

    private homePage home = new homePage();

    @Given("{string} Ingresa al homePage prixz {string}")
    public void ingresaAlHomePagePrixz(String actor, String recorder) throws Exception {
        MyScreenRecorder.startRecording(recorder);
        theActorCalled(actor).wasAbleTo(Open.browserOn(home));
        BrowseTheWeb.as(Actor.named(actor)).getAlert().accept();
    }

    @And("Hace click sobre el boton login ingresa usuario {string} ingresa contraseña {string} y hace click sobre acceder")
    public void haceClickSobreElBotonLoginIngresaUsuarioIngresaContraseñaYHaceClickSobreAcceder(String usuario, String contrasena) {
        theActorInTheSpotlight().wasAbleTo(ingresarLogin(usuario,contrasena));
    }

    @When("valida textos pantalla mi cuenta {string} {string} {string} {string} {string}	{string}")
    public void validaTextosPantallaMiCuenta(String pedidos, String direcciones, String datos, String inicio, String lealtad, String salir) {
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Tus pedidos de mi cuenta",validateTextPedidos(),equalTo(pedidos)),
                seeThat("Validar el texto Direcciones de mi cuenta",validateTextDirecciones(),equalTo(direcciones)),
                seeThat("Validar el texto Mis datos de mi cuenta",validateTextDatos(),equalTo(datos)),
                seeThat("Validar el texto Inicio de mi cuenta",validateTextInicio(),equalTo(inicio)),
                seeThat("Validar el texto Programa de Lealtad de mi cuenta",validateTextLealtad(),equalTo(lealtad)),
                seeThat("Validar el texto Salir de mi cuenta",validateTextSalir(),equalTo(salir))
        );
    }

    @And("Hace click en el logo")
    public void HaceClickEnElLogo() {
        theActorInTheSpotlight().wasAbleTo(clickLogoPrixz());
    }

    @And("Agrega un producto al carrito compras puede aumentar y disminuir la cantidad")
    public void agregaUnProductoAlCarritoComprasPuedeAumentarYDisminuirLaCantidad() {
        theActorInTheSpotlight().wasAbleTo(agregarProductoUno());
    }

    @And("Hace click en seguir comprando agrega otro producto y hace click en finalizar compra")
    public void haceClickEnSeguirComprandoAgregaOtroProductoYHaceClickEnFinalizarCompra() {
        theActorInTheSpotlight().wasAbleTo(agregarProductoDos());
        //theActorInTheSpotlight().wasAbleTo(finalizarCompra());
    }

    @And("Envia todos los campos obligatorios {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} y da click en continuar compra")
    public void enviaTodosLosCamposObligatoriosYDaClickEnContinuarCompra(String usuario,String CkNombre, String CkApellido,
                                                                         String CkDireccion, String CkExterior, String CkInterior, String CkPostal, String CkEstado, String CkCiudad, String CkTelefono) {
        theActorInTheSpotlight().wasAbleTo(
                datosCheckout(usuario, CkNombre, CkApellido, CkDireccion, CkExterior, CkInterior, CkPostal, CkEstado, CkCiudad, CkTelefono));
    }

    @And("Selecciona nueva tarjeta debito o credito")
    public void seleccionaNuevaTarjetaDebitoOCredito() {
        theActorInTheSpotlight().wasAbleTo(tarjetaCredDeb());
    }

    @And("Ingresa el N tarjeta {string} vencimiento {string} titular {string} CVV {string} click en continuar")
    public void ingresaElNTarjetaVencimientoTitularCVVClickEnContinuar(String Ntarjeta, String Nvencimiento, String Ntitular, String cvv) {
        theActorInTheSpotlight().wasAbleTo(pagos(Ntarjeta,Nvencimiento,Ntitular,cvv));
    }

    @And("Selecciona la cuota {string}")
    public void seleccionaLaCuota(String Ncuotas) {
        theActorInTheSpotlight().wasAbleTo(cuotas(Ncuotas)
        );
    }


    @Then("Valida el boton de pago")
    public void validaElBotonDePago() throws InterruptedException {
        theActorInTheSpotlight().should(
                seeThat("Validar el boton pagar al final del flujo",validateTextPagar(),is(not(empty())))
        );
        System.out.println("*********"+validateTextPagar().answeredBy(theActorInTheSpotlight()));//Responda el actor en escena el valor en string
        Thread.sleep(3000);
    }

}
