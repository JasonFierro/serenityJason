package userInterfaces.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class homePage extends PageObject {

    public static final Target BTN_INGRESAR = Target.the("Link boton ingresar").located(By.xpath("//span[@class='account-label-ingresa']"));
    public static final Target BTN_CREAR_CUENTA = Target.the("Link crear cuenta").located(By.cssSelector(".account-label-crea"));
    public static final Target LOGO_PRIXZ = Target.the("Logo Prixz").located(By.cssSelector("[href='https://prixz.com']"));
    public static final Target LABEL_DESTACADOS = Target.the("Texto destacados").located(By.xpath("//h3[.='Destacados']"));
    public static final Target ADD_CARD_ONE = Target.the("Producto uno destacados").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[1]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_TREE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[1]/div/p/span"));
    public static final Target ADD_CARD_TWO = Target.the("Producto dos destacados").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[2]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[2]/div/p/span"));
    public static final Target ADD_CARD_TRHEE = Target.the("Producto tres destacados").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[3]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[3]/div/p/span"));
    public static final Target ADD_CARD_FOUR = Target.the("Producto cuatro destacados").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[3]/div/div/div/div/div[4]/div/p/span"));
    public static final Target BTN_PLUS = Target.the("Aumentar producto desde el +").located(By.xpath("//div[@class='cfw-quantity-stepper-btn-plus ']"));
    public static final Target BTN_MINUS = Target.the("Disminuir producto desde el -").located(By.xpath("//div[@class='cfw-quantity-stepper-btn-minus']"));
    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Boton finalizar compra").located(By.xpath("//a[contains(.,'Finalizar compra')]"));
    public static final Target BTN_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando").located(By.xpath("//a[contains(.,'Seguir comprando')]"));
    public static final Target MENSAJE_ALERTA_STOCK_REFRIGERADO = Target.the("Mensaje de alerta sin stcok o producto refrigerado").located(By.cssSelector("#stock_insuficiente .texto_principal_refrigerado"));
    public static final Target CARRITO_COMPRAS = Target.the("Carrito de compras").located(By.cssSelector(".cfw-side-cart-floating-button"));

    public static final Target INPUT_SEARCH = Target.the("Caja de texto buscador").located(By.cssSelector("[name='s']"));
    public static final Target LABEL_OFERTA_EXPRESS = Target.the("Texto categorias oferta express").located(By.xpath("//a[.='Oferta express']"));
    public static final Target LABEL_FARMACIA = Target.the("Texto categorias farmacia").located(By.xpath("//a[.='Farmacia']"));
    public static final Target LABEL_DIABETES = Target.the("Texto categorias diabetes").located(By.xpath("//a[.='Diabetes']"));
    public static final Target LABEL_GENERICOS = Target.the("Texto categorias genericos").located(By.xpath("//a[.='Genéricos']"));
    public static final Target LABEL_BIENESTAR = Target.the("Texto categorias bienestar").located(By.xpath("//a[.='Bienestar']"));
    public static final Target LABEL_CUIDADO_PERSONAL = Target.the("Texto categorias cuidado personal").located(By.xpath("//a[.='Cuidado personal']"));
    public static final Target LABEL_DERMA = Target.the("Texto categorias derma").located(By.xpath("//a[.='Derma']"));
    public static final Target LABEL_TRATAMIENTO_CAPILAR = Target.the("Texto categorias tratamiento capilar").located(By.xpath("//a[.='Tratamiento capilar']"));
    public static final Target LABEL_SALUD_SEXUAL = Target.the("Texto categorias salud sexual").located(By.xpath("//a[.='Salud sexual']"));

    public static final Target BANNER = Target.the("Banner home").located(By.xpath("/html/body/main/section[1]/div"));

    public static final Target LABEL_TIENDAS_OFICIALES = Target.the("Titulo tiendas oficiales").located(By.xpath("//div[@class='titulo-tiendas-container']/h2[@class='titulo-tiendas']"));
    public static final Target LABEL_ASTRAZENECA = Target.the("Titulo astrazenaca").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/astra-zeneca/']/p[@class='name-store']"));
    public static final Target LABEL_BABE = Target.the("Titulo babe").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/babe/']/p[@class='name-store']"));
    public static final Target LABEL_BAUSHCH_OTC = Target.the("Titulo baushch otc").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/bausch-otc/']/p[@class='name-store']"));
    public static final Target LABEL_BAUSHCH_RX = Target.the("Titulo baushch rx").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/bausch/']/p[@class='name-store']"));
    public static final Target LABEL_BAYER = Target.the("Titulo bayer").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/bayer/']/p[@class='name-store']"));
    public static final Target LABEL_BELENUS = Target.the("Titulo belenus").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/belenus-pharm/']/p[@class='name-store']"));
    public static final Target LABEL_CEUTICA = Target.the("Titulo ceutica").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/ceutica/']/p[@class='name-store']"));
    public static final Target LABEL_IFA = Target.the("Titulo ifa").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/ifa/']/p[@class='name-store']"));
    public static final Target LABEL_ISDIN = Target.the("Titulo isdin").located(By.xpath("//div[@class='tiendas-oficiales-images']//a[@href='/categoria-producto/isdin-1/']/p[@class='name-store']"));
    public static final Target LABEL_MEDIALISIS = Target.the("Titulo medialisis").located(By.xpath("//div[10]//p[@class='name-store']"));
    public static final Target LABEL_PFIZER = Target.the("Titulo pfier").located(By.xpath("//div[11]//p[@class='name-store']"));
    public static final Target LABEL_TEMPUS = Target.the("Titulo tempus").located(By.xpath("//div[12]//p[@class='name-store']"));
    public static final Target LABEL_M8 = Target.the("Titulo m8").located(By.xpath("//div[13]//p[@class='name-store']"));

    public static final Target ORIENTACION_MEDICA = Target.the("Modulo Orientación Medica").located(By.id("medico-online-home"));

    public static final Target LABEL_CLUB_OFERTAS = Target.the("Titulo club ofertas").located(By.xpath("//h3[.='Club ofertas']"));
    public static final Target ADD_CARD_ONE_CLUB = Target.the("Producto uno club ofertas").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO_CLUB = Target.the("Producto dos club ofertas").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[2]/div/button"));
    public static final Target ADD_CARD_TRHEE_CLUB = Target.the("Producto tres club ofertas").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[3]/div/button"));
    public static final Target ADD_CARD_FOUR_CLUB = Target.the("Producto cuatro club ofertas").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_OFERTAS_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[1]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_OFERTAS_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[2]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_OFERTAS_TRHEE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[3]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_OFERTAS_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[8]/div/div/div/div/div[4]/div/p/span"));

    public static final Target LABEL_CUIDA_PIEL = Target.the("Titulo cuida tu piel").located(By.xpath("//h3[.='Cuida tu piel']"));
    public static final Target ADD_CARD_ONE_PIEL = Target.the("Producto uno cuida tu piel").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO_PIEL = Target.the("Producto dos cuida tu piel").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[2]/div/button"));
    public static final Target ADD_CARD_TRHEE_PIEL = Target.the("Producto tres cuida tu piel").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[3]/div/button"));
    public static final Target ADD_CARD_FOUR_PIEL = Target.the("Producto cuatro cuida tu piel").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_PIEL_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[1]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_PIEL_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[2]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_PIEL_TRHEE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[3]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_PIEL_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[9]/div/div/div/div/div[4]/div/p/span"));

    public static final Target LABEL_T_BIENESTAR = Target.the("Titulo bienestar").located(By.xpath("//h3[.='Bienestar']"));
    public static final Target ADD_CARD_ONE_BIENESTAR = Target.the("Producto uno bienestar").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO_BIENESTAR = Target.the("Producto dos bienestar").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[2]/div/button"));
    public static final Target ADD_CARD_TRHEE_BIENESTAR = Target.the("Producto tres bienestar").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[3]/div/button"));
    public static final Target ADD_CARD_FOUR_BIENESTAR = Target.the("Producto cuatro bienestar").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_BIENESTAR_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[1]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_BIENESTAR_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[2]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_BIENESTAR_TRHEE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[3]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_BIENESTAR_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[10]/div/div/div/div/div[4]/div/p/span"));

    public static final Target LABEL_CONTROL_DIABETES = Target.the("Titulo diabetes").located(By.xpath("//h3[.='Control diabetes']"));
    public static final Target ADD_CARD_ONE_DIABETES = Target.the("Producto uno diabetes").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO_DIABETES = Target.the("Producto dos diabetes").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[2]/div/button"));
    public static final Target ADD_CARD_TRHEE_DIABETES = Target.the("Producto tres diabetes").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[3]/div/button"));
    public static final Target ADD_CARD_FOUR_DIABETES = Target.the("Producto cuatro diabetes").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_DIABETES_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[1]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_DIABETES_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[2]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_DIABETES_TRHEE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[3]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_DIABETES_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[11]/div/div/div/div/div[4]/div/p/span"));

    public static final Target LABEL_T_SALUD_SEXUAL = Target.the("Titulo salud sexual").located(By.xpath("//h3[.='Salud sexual']"));
    public static final Target ADD_CARD_ONE_SEXUAL = Target.the("Producto uno salud sexual").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[1]/div/button"));
    public static final Target ADD_CARD_TWO_SEXUAL = Target.the("Producto dos salud sexual").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[2]/div/button"));
    public static final Target ADD_CARD_THREE_SEXUAL = Target.the("Producto tres salud sexual").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[3]/div/button"));
    public static final Target ADD_CARD_FOUR_SEXUAL = Target.the("Producto cuatro salud sexual").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[4]/div/button"));
    public static final Target TEXT_VALOR_ENVIO_SEXUAL_ONE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[1]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_SEXUAL_TWO = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[2]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_SEXUAL_TRHEE = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[3]/div/p/span"));
    public static final Target TEXT_VALOR_ENVIO_SEXUAL_FOUR = Target.the("Texto del valor de envio").located(By.xpath("/html/body/main/section[12]/div/div/div/div/div[4]/div/p/span"));

    public static final Target LABEL_PRIXZ_MEDIOS = Target.the("Titulo prixz en los medios").located(By.xpath("//div[@class='n2-ss-layer n2-ow n-uc-5VPTcWs6hX6v']/div[@class='n2-font-71a160671a53fd6d4fc2dd78fb5ff5f5-hover   n2-ss-item-content n2-ss-text n2-ow']"));
    public static final Target LABEL_CRONICA = Target.the("Titulo cronica").located(By.id("n2-ss-9item3"));

    public static final Target LABEL_POLITICAS = Target.the("Titulo politicas").located(By.xpath("//h4[.='POLITICAS']"));
    public static final Target LABEL_POLITICAS_DEVOLUCION = Target.the("Titulo politicas de devolución").located(By.cssSelector("[href='https://prixz.com/politicas-de-devolucion/']"));
    public static final Target LABEL_POLITICAS_TERMINOS = Target.the("Titulo terminos y condiciones").located(By.cssSelector("[href='https://prixz.com/terminos-y-condiciones/']"));
    public static final Target LABEL_POLITICAS_PRIVACIDAD = Target.the("Titulo aviso de privacidad").located(By.cssSelector("[href='https://prixz.com/aviso-de-privacidad/']"));
    public static final Target LABEL_POLITICAS_SOPORTE = Target.the("Titulo soporte").located(By.cssSelector("[href='https://prixz.com/chat/']"));
    public static final Target LABEL_POLITICAS_PREGUNTAS = Target.the("Titulo preguntas frecuentes").located(By.cssSelector("[href='https://prixz.com/faq/']"));
    public static final Target LABEL_POLITICAS_UNETE = Target.the("Titulo unete a nosotros").located(By.cssSelector("[href='https://prixz.factorial.mx/']"));

    public static final Target LABEL_SALUD = Target.the("Titulo salud").located(By.xpath("//h4[.='SALUD']"));
    public static final Target LABEL_SALUD_GUIA = Target.the("Titulo guia de salud").located(By.cssSelector("[href='https://prixz.com/salud/']"));
    public static final Target LABEL_SALUD_MEDICAMENTOS = Target.the("Titulo medicamentos").located(By.cssSelector("[href='https://prixz.com/salud/medicamentos/']"));
    public static final Target LABEL_SALUD_PRODUCTOS = Target.the("Titulo productos").located(By.cssSelector("[href='https://prixz.com/salud/productos/']"));

    public static final Target LABEL_APP = Target.the("Titulo app").located(By.xpath("//h4[.='app']"));
    public static final Target IMG_GOOGLE_PLAY = Target.the("Imagen de play store google").located(By.xpath("//img[@src='https://res.cloudinary.com/prixz/image/upload/w_200/v1638558235/items/icons/google-play-es.png']"));
    public static final Target IMG_APP_STORE = Target.the("Imagen de app store apple").located(By.xpath("//img[@src='https://res.cloudinary.com/prixz/image/upload/w_200/v1638809810/items/icons/consiguelo-app-store.png']"));



}
