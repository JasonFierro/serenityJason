package stepDefinitions.flujos;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Scroll;
import org.mockito.internal.matchers.Or;

import java.util.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;
import static questions.home.homeQtns.*;
import static userInterfaces.home.homePage.*;

public class homeDefinition {

    @And("Valida el logo tambien el buscador y header del home {string} {string}")
    public void validaElLogoTambienElBuscadorYHeaderDelHome(String ingresa, String creaTuCuenta) {
        try {
            Thread.sleep(2000);
            System.out.println("****************************************");
            System.out.println("**          Valida el Header          **");
            System.out.println("****************************************");
            theActorInTheSpotlight().should(
                    seeThat("Validar el logo header",validateLogo()),
                    seeThat("Validar el buscador header",validateSearch()),
                    seeThat("Validar el ingresar header",validateTextIngresa(),equalTo(ingresa)),
                    seeThat("Validar el crear cuenta header",validateTextCrearCuenta(),equalTo(creaTuCuenta))
            );
        }catch (Exception e){
            e.getLocalizedMessage();
            e.getMessage();
            e.toString();
            e.getCause();
        }
    }

    @And("Valida los textos de las categorias {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void validaLosTextosDeLasCategorias(String oferta, String farmacia, String diabetes, String genericos, String bienestar, String cuidado, String derma, String tratamiento, String salud) throws InterruptedException {
        Thread.sleep(2000);
        try {
            System.out.println("****************************************");
            System.out.println("**          Valida las categorias     **");
            System.out.println("****************************************");
            theActorInTheSpotlight().should(
                    seeThat("Validar el texto oferta",validateTextOfertaExpress(),equalTo(oferta)),
                    seeThat("Validar el texto farmacia",validateTextFarmacia(),equalTo(farmacia)),
                    seeThat("Validar el texto dibetes",validateTextDiabetes(),equalTo(diabetes)),
                    seeThat("Validar el texto genericos",validateTextGenericos(),equalTo(genericos)),
                    seeThat("Validar el texto bienestar",validateTextBienestar(),equalTo(bienestar)),
                    seeThat("Validar el texto cuidado",validateTextCuidadoPersonal(),equalTo(cuidado)),
                    seeThat("Validar el texto derma",validateTextDerma(),equalTo(derma)),
                    seeThat("Validar el texto tratamiento",validateTextTratamientoCapilar(),equalTo(tratamiento)),
                    seeThat("Validar el texto salud",validateTextSaludSexual(),equalTo(salud))
            );
        }catch (Exception e){
            e.getLocalizedMessage();
            e.getMessage();
            e.toString();
            e.getCause();
        }
    }

    @And("Valida que el banner si este dentro del dom")
    public void validaQueElBannerSiEsteDentroDelDom() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("****************************************");
        System.out.println("**          Valida el Banner          **");
        System.out.println("****************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar que este visible el banner",validateBanner())
        );
    }

    @And("Valida el titulo destacados {string} y confirmar los productos visibles")
    public void validaElTituloDestacadosYConfirmarLosProductosVisibles(String Tdestacados) throws InterruptedException {
        try {

            Thread.sleep(2000);
            System.out.println("****************************************");
            System.out.println("**  Valida el contenedor destacados   **");
            System.out.println("****************************************");
            theActorInTheSpotlight().attemptsTo(
                    Scroll.to(LABEL_DESTACADOS)
            );
            theActorInTheSpotlight().should(
                    seeThat("Validar el texto Destacados de los productos",validateTextDestacados(),equalTo(Tdestacados)),
                    seeThat("Validar el producto destacado visible uno",validateProductDestacadosOne()),
                    seeThat("Validar el producto destacado visible dos",validateProductDestacadosTwo()),
                    seeThat("Validar el producto destacado visible tres",validateProductDestacadosThree()),
                    seeThat("Validar el producto destacado visible cuatro",validateProductDestacadosFour()),
                    seeThat("Validar el envio producto destacado visible",validateProductDestacadosEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
//                seeThat("Validar el envio producto destacado visible",validateProductDestacadosEnvio(),equalTo(new String[] {"Envío gratis","Envío gratis a partir de $205"}))
            );
            System.out.println("**************************************************************************************");
            System.out.println("** Envio primer producto destacados: "+validateProductDestacadosEnvio().answeredBy(theActorInTheSpotlight())+" **");
            System.out.println("**************************************************************************************");
        } catch (Exception e){
            System.out.println("AQuiiiiiiiiiiiiiii");
            e.getLocalizedMessage();
            e.getMessage();
        }
    }

    @And("Valida el titulo tiendas oficiales {string} y confirmar las tiendas visibles")
    public void validaElTituloTiendasOficialesYConfirmarLasTiendasVisibles(String Ttiendas) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("********************************************");
        System.out.println("** Valida el contenedor tiendas oficiales **");
        System.out.println("********************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Tiendas oficiales",validateTextTiendasOficiales(),equalTo(Ttiendas)),
                seeThat("Validar la tienda Astrazeneca visible",validateProductTiendasOficialesAstrazeneca()),
                seeThat("Validar la tienda Babe visible",validateProductTiendasOficialesBabe()),
                seeThat("Validar la tienda Baushch OTC",validateProductTiendasOficialesBaushchOtc()),
                seeThat("Validar la tienda Baushch RX visible",validateProductTiendasOficialesBaushchRx()),
                seeThat("Validar la tienda Bayer visible",validateProductTiendasOficialesBayer()),
                seeThat("Validar la tienda Belenus visible",validateProductTiendasOficialesBelenus()),
                seeThat("Validar la tienda Ceutica visible",validateProductTiendasOficialesCeutica()),
                seeThat("Validar la tienda Ifa visible",validateProductTiendasOficialesIfa()),
                seeThat("Validar la tienda Isdin visible",validateProductTiendasOficialesIsdin()),
                seeThat("Validar la tienda Medialisis visible",validateProductTiendasOficialesMedialisis()),
                seeThat("Validar la tienda Pfizer visible",validateProductTiendasOficialesPfizer()),
                seeThat("Validar la tienda Tempus visible",validateProductTiendasOficialesTempus()),
                seeThat("Validar la tienda Tienda M8 visible",validateProductTiendasOficialesM8())
        );
    }

    @And("Valida el contenedor orientación medica en linea que este visible")
    public void validaElContenedorOrientaciónMedicaEnLineaQueEsteVisible() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("** Valida el contenedor orientación médica **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(ORIENTACION_MEDICA)
        );
        theActorInTheSpotlight().should(
                seeThat("Validar el contendor orientación medica",validateOrientacionMedica())
        );
    }

    @And("Valida el titulo club ofertas {string} y confirmar los productos visibles")
    public void validaElTituloClubOfertasYConfirmarLosProductosVisibles(String Tclub) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("**    Valida el contenedor club ofertas    **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Club ofertas de los productos",validateTextClubOfertas(),equalTo(Tclub)),
                seeThat("Validar el producto Club ofertas visible uno",validateTextClubOfertasProductOne()),
                seeThat("Validar el producto Club ofertas visible dos",validateTextClubOfertasProductTwo()),
                seeThat("Validar el producto Club ofertas visible tres",validateTextClubOfertasProductTrhee()),
                seeThat("Validar el producto Club ofertas visible cuatro",validateTextClubOfertasProductFour()),
                seeThat("Validar el envio producto Club ofertas visible",validateProductClubOfertasEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
        );
        System.out.println("**************************************************************************************");
        System.out.println("** Envio primer producto club ofertas: "+validateProductClubOfertasEnvio().answeredBy(theActorInTheSpotlight())+" **");
        System.out.println("**************************************************************************************");
    }

    @And("Valida el titulo cuida tu piel {string} y confirmar los productos visibles")
    public void validaElTituloCuidaTuPielYConfirmarLosProductosVisibles(String Tcuida) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("**   Valida el contenedor cuida tu piel    **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Cuida tu piel de los productos",validateTextCuidaTuPiel(),equalTo(Tcuida)),
                seeThat("Validar el producto Cuida tu piel visible uno",validateProductCuidaTuPielOne()),
                seeThat("Validar el producto Cuida tu piel visible dos",validateProductCuidaTuPielTwo()),
                seeThat("Validar el producto Cuida tu piel visible tres",validateProductCuidaTuPielTrhee()),
                seeThat("Validar el producto Cuida tu piel visible cuatro",validateProductCuidaTuPielFour()),
                seeThat("Validar el envio producto Cuida tu piel visible",validateProductCuidaTuPielEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
        );
        System.out.println("**************************************************************************************");
        System.out.println("** Envio primer producto cuida tu piel: "+validateProductCuidaTuPielEnvio().answeredBy(theActorInTheSpotlight())+" **");
        System.out.println("**************************************************************************************");
    }

    @And("Valida el titulo bienestar {string} y confirmar los productos visibles")
    public void validaElTituloBienestarYConfirmarLosProductosVisibles(String Tbienestar) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("**     Valida el contenedor Bienestar      **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(LABEL_T_BIENESTAR)
        );
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Cuida tu piel de los productos",validateTextTituloBienestar(),equalTo(Tbienestar)),
                seeThat("Validar el producto Bienestar visible uno",validateProductBienestarOne()),
                seeThat("Validar el producto Bienestar visible dos",validateProductBienestarTwo()),
                seeThat("Validar el producto Bienestar visible tres",validateProductBienestarTrhee()),
                seeThat("Validar el producto Bienestar visible cuatro",validateProductBienestarFour()),
                seeThat("Validar el envio producto Bienestar visible",validateProductBienestarEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
        );
        System.out.println("**************************************************************************************");
        System.out.println("** Envio primer producto bienestar: "+validateProductBienestarEnvio().answeredBy(theActorInTheSpotlight())+ " **");
        System.out.println("**************************************************************************************");
    }

    @And("Valida el titulo control diabetes {string} y confirmar los productos visibles")
    public void validaElTituloControlDiabetesYConfirmarLosProductosVisibles(String Tcontrol) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("**  Valida el contenedor control diabetes  **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Control Diabetes de los productos",validateTextControlDiabetes(),equalTo(Tcontrol)),
                seeThat("Validar el producto Control Diabetes visible uno",validateProductControlDiabetesOne()),
                seeThat("Validar el producto Control Diabetes visible dos",validateProductControlDiabetesTwo()),
                seeThat("Validar el producto Control Diabetes visible tres",validateProductControlDiabetesOneTrhee()),
                seeThat("Validar el producto Control Diabetes visible cuatro",validateProductControlDiabetesFour()),
                seeThat("Validar el envio producto Control Diabetes visible",validateProductControlDiabetesEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
        );
        System.out.println("*******************************************************************************************");
        System.out.println("** Envio primer producto control diabetes: "+validateProductControlDiabetesEnvio().answeredBy(theActorInTheSpotlight())+" **");
        System.out.println("*******************************************************************************************");
    }

    @And("Valida el titulo salud sexual {string} y confirmar los productos visibles")
    public void validaElTituloSaludSexualYConfirmarLosProductosVisibles(String Tsalud) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("*********************************************");
        System.out.println("**    Valida el contenedor salud sexual    **");
        System.out.println("*********************************************");
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(LABEL_T_SALUD_SEXUAL)
        );
        theActorInTheSpotlight().should(
                seeThat("Validar el texto salud sexual de los productos",validateTextTituloSaludSexual(),equalTo(Tsalud)),
                seeThat("Validar el producto salud sexual visible uno",validateProductSaludSexualOne()),
                seeThat("Validar el producto salud sexual visible dos",validateProductSaludSexualTwo()),
                seeThat("Validar el producto salud sexual visible tres",validateProductSaludSexualThree()),
                seeThat("Validar el producto salud sexual visible cuatro",validateProductSaludSexualFour()),
                seeThat("Validar el envio producto salud sexual visible",validateProductSaludSexualEnvio(),either(containsString("Envío gratis")).or(containsString("Envío gratis a partir de $205")))
        );
        Thread.sleep(2000);
        System.out.println("**************************************************************************************");
        System.out.println("** Envio primer producto salud sexual: "+validateProductSaludSexualEnvio().answeredBy(theActorInTheSpotlight())+" **");
        System.out.println("**************************************************************************************");
    }

    @And("Valida el titulo prixz en los medios y confirmar información visible")
    public void validaElTituloPrixzEnLosMediosYConfirmarInformaciónVisible() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("**********************************************");
        System.out.println("** Valida el contenedor prixz en los medios **");
        System.out.println("**********************************************");
        theActorInTheSpotlight().should(
                seeThat("Validar el titulo prixz en los medios",validateTextPrixzMedios(),equalTo("\"Prixz en los medios\""))
        );
    }

    @And("Valida el footer prixz  de politias salud app")
    public void validaElFooterPrixzDePolitiasSaludApp() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("**********************************************");
        System.out.println("** Valida el contenedor politicas-salud-app **");
        System.out.println("**********************************************");
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(LABEL_POLITICAS)
        );
        theActorInTheSpotlight().should(
                seeThat("Validar el texto Politicas del footer",validateTextFooterPoliticas(),equalTo("POLITICAS")),
                seeThat("Validar el texto Politicas devolución del footer",validateTextFooterPoliticasDevolucion(),equalTo("Políticas de Devolución")),
                seeThat("Validar el texto Politicas terminos y condiciones del footer",validateTextFooterPoliticasTerminos(),equalTo("Términos y Condiciones")),
                seeThat("Validar el texto Politicas privacidad del footer",validateTextFooterPoliticasPrivacidad(),equalTo("Aviso de Privacidad")),
                seeThat("Validar el texto Politicas soporte del footer",validateTextFooterPoliticasSoporte(),equalTo("Soporte")),
                seeThat("Validar el texto Politicas preguntas del footer",validateTextFooterPoliticasPreguntas(),equalTo("Preguntas Frecuentes")),
                seeThat("Validar el texto Politicas unete del footer",validateTextFooterPoliticasUnete(),equalTo("Únete a nosotros")),
                seeThat("Validar el texto salud del footer",validateTextFooterSalud(),equalTo("SALUD")),
                seeThat("Validar el texto salud guia del footer",validateTextFooterSaludGuia(),equalTo("Guía de salud")),
                seeThat("Validar el texto salud medicamentos del footer",validateTextFooterSaludMedicamentos(),equalTo("Medicamentos")),
                seeThat("Validar el texto salud productos del footer",validateTextFooterSaludProductos(),equalTo("Productos")),
                seeThat("Validar el texto APP del footer",validateTextFooterAPP(),equalTo("APP")),
                seeThat("Validar que este visible la imagen play store del footer",validateTextFooterIamgenGooglePlay()),
                seeThat("Validar que este visible la imagen store apple del footer",validateTextFooterImagenStoreApple()),
                seeThat("Validar que este el carrito de compras visible",validateCarBuy())
        );
    }


}
