package questions.home;

import gherkin.lexer.Vi;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import userInterfaces.home.homePage;
import userInterfaces.portalPagos.pagosPage;

public class homeQtns{

    @NotNull
    @Contract(pure = true)
    public static Question validateLogo(){
        return actor -> actor.asksFor(Visibility.of(homePage.LOGO_PRIXZ));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateSearch(){

        return actor -> actor.asksFor(Visibility.of(homePage.INPUT_SEARCH));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextIngresa(){

        return actor -> actor.asksFor(Text.of(homePage.BTN_INGRESAR).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextCrearCuenta(){

        return actor -> actor.asksFor(Text.of(homePage.BTN_CREAR_CUENTA).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextOfertaExpress(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_OFERTA_EXPRESS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFarmacia(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_FARMACIA).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextDiabetes(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_DIABETES).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextGenericos(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_GENERICOS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextBienestar(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_BIENESTAR).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextCuidadoPersonal(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_CUIDADO_PERSONAL).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextDerma(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_DERMA).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextTratamientoCapilar(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_TRATAMIENTO_CAPILAR).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextSaludSexual(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_SALUD_SEXUAL).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateBanner(){

        return actor -> actor.asksFor(Visibility.of(homePage.BANNER));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextDestacados(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_DESTACADOS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductDestacadosOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductDestacadosTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductDestacadosThree(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TRHEE));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductDestacadosFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductDestacadosEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextTiendasOficiales(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_TIENDAS_OFICIALES).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesAstrazeneca(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_ASTRAZENECA));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesBabe(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_BABE));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesBaushchOtc(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_BAUSHCH_OTC));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesBaushchRx(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_BAUSHCH_RX));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesBayer(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_BAYER));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesBelenus(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_BELENUS));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesCeutica(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_CEUTICA));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesIfa(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_IFA));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesIsdin(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_ISDIN));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesMedialisis(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_MEDIALISIS));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesPfizer(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_PFIZER));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesTempus(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_TEMPUS));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductTiendasOficialesM8(){

        return actor -> actor.asksFor(Visibility.of(homePage.LABEL_M8));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateOrientacionMedica(){

        return actor -> actor.asksFor(Visibility.of(homePage.ORIENTACION_MEDICA));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextClubOfertas(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_CLUB_OFERTAS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextClubOfertasProductOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE_CLUB));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextClubOfertasProductTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO_CLUB));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextClubOfertasProductTrhee(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TRHEE_CLUB));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextClubOfertasProductFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR_CLUB));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductClubOfertasEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_OFERTAS_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextCuidaTuPiel(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_CUIDA_PIEL).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductCuidaTuPielOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE_PIEL));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductCuidaTuPielTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO_PIEL));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductCuidaTuPielTrhee(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TRHEE_PIEL));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductCuidaTuPielFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR_PIEL));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductCuidaTuPielEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_PIEL_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextTituloBienestar(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_T_BIENESTAR).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductBienestarOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE_BIENESTAR));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductBienestarTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO_BIENESTAR));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductBienestarTrhee(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TRHEE_BIENESTAR));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductBienestarFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR_BIENESTAR));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductBienestarEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_BIENESTAR_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextControlDiabetes(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_CONTROL_DIABETES).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductControlDiabetesOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE_DIABETES));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductControlDiabetesTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO_DIABETES));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductControlDiabetesOneTrhee(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TRHEE_DIABETES));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductControlDiabetesFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR_DIABETES));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductControlDiabetesEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_DIABETES_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextTituloSaludSexual(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_T_SALUD_SEXUAL).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateProductSaludSexualOne(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_ONE_SEXUAL));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductSaludSexualTwo(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_TWO_SEXUAL));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductSaludSexualThree(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_THREE_SEXUAL));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductSaludSexualFour(){

        return actor -> actor.asksFor(Visibility.of(homePage.ADD_CARD_FOUR_SEXUAL));
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateProductSaludSexualEnvio(){

        return actor -> actor.asksFor(Text.of(homePage.TEXT_VALOR_ENVIO_SEXUAL_ONE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextPrixzMedios(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_PRIXZ_MEDIOS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextCronicas(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_CRONICA).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticas(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasDevolucion(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_DEVOLUCION).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasTerminos(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_TERMINOS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasPrivacidad(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_PRIVACIDAD).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasSoporte(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_SOPORTE).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasPreguntas(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_PREGUNTAS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterPoliticasUnete(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_POLITICAS_UNETE).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterSalud(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_SALUD).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterSaludGuia(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_SALUD_GUIA).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterSaludMedicamentos(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_SALUD_MEDICAMENTOS).asString());
    }
    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterSaludProductos(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_SALUD_PRODUCTOS).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterAPP(){

        return actor -> actor.asksFor(Text.of(homePage.LABEL_APP).asString());
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterIamgenGooglePlay(){

        return actor -> actor.asksFor(Visibility.of(homePage.IMG_GOOGLE_PLAY));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateTextFooterImagenStoreApple(){

        return actor -> actor.asksFor(Visibility.of(homePage.IMG_APP_STORE));
    }

    @NotNull
    @Contract(pure = true)
    public static Question validateCarBuy(){

        return actor -> actor.asksFor(Visibility.of(homePage.CARRITO_COMPRAS));
    }
}
