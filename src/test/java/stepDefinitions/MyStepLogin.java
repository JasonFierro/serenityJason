package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ScreenRecorder.MyScreenRecorder;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.pantallaPrincipalQtns;
import tasks.pantallaBookStoreTask;
import tasks.pantallaPrincipalTask;
import userInterfaces.home.homePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class MyStepLogin extends pantallaPrincipalQtns{

    @Before
    public void configuracionInicial() throws Exception {
        setTheStage(new OnlineCast());
    }

    @After
    public void TearDown() throws Exception {
        MyScreenRecorder.stopRecording();
    }

    private homePage home = new homePage();

    @Given("{string} Ingresar a la pagina principal toolsQA {string}")
    public void ingresarALaPaginaPrincipalToolsQA(String nombreActor, String recorder) throws Exception {
        MyScreenRecorder.startRecording(recorder);
        theActorCalled(nombreActor).wasAbleTo(Open.browserOn(home));
    }

    @And("Seleccionar el icono Book Store")
    public void seleccionarElIconoBookStore() {
        theActorInTheSpotlight().wasAbleTo(pantallaPrincipalTask.bookStore());
    }

    @And("Hacer click sobre Login ingresar usuario {string} y contrasena {string}")
    public void hacerClickSobreLoginIngresarUsuarioYContrasena(String usuario, String contrasena) {
        theActorInTheSpotlight().wasAbleTo(pantallaBookStoreTask.ingresarLogin(usuario,contrasena));
        System.out.println("*********"+validateTextUsername().answeredBy(theActorInTheSpotlight()));//Responda el actor en escena el valor en string
        System.out.println("*********"+validateTextPassword().answeredBy(theActorInTheSpotlight()));//Responda el actor en escena el valor en string
    }

    @When("Hacer click sobre el boton bookStore")
    public void hacerClickSobreElBotonBookStore() {

    }

    @Then("Validar que ingreso a la pagina principal {string}")
    public void validarQueIngresoALaPaginaPrincipal( String textoEsperadoUser) {
        theActorInTheSpotlight().should(
                seeThat("Validar el label UserName", validateTextUsername(),is(not(empty()))));
                seeThat("Validar el label UserName", validateTextUsername(),not(contains()));
    }

    @Then("Validar que ingreso a la pagina principal {string} {string}")
    public void validarQueIngresoALaPaginaPrincipal( String textoEsperadoUser, String textoEsperadoPass) {
        theActorInTheSpotlight().should(
                seeThat("Validar el label UserName", validateTextUsername(),equalTo(textoEsperadoUser)),
                seeThat("Validar el label password", validateTextPassword(),equalTo(textoEsperadoPass)));
//        theActorInTheSpotlight().attemptsTo( // De esta manera tambien se puede hacer pero se tiene que llamar directo al Target
//                Ensure.that(bookStorePage.LABEL_USER).text().isNotEqualTo(textoEsperadoUser),
//                Ensure.that(bookStorePage.LABEL_PASSWORD).text().isEqualTo(textoEsperadoPass));
//        theActorInTheSpotlight().attemptsTo(
//                SelectFromOptions.byVisibleText("").from(bookStorePage.LABEL_USER));
    }
}
