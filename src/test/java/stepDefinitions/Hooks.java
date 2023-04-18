//package stepDefinitions;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import runner.browser_manager.DriverManager;
//import runner.browser_manager.DriverManagerFactory;
//import runner.browser_manager.DriverType;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.concurrent.TimeUnit;
//
//public class Hooks {
//
//    private static WebDriver driver;
//    private static int numberOfCase = 0;
//
//    @Before
//    public void SetUp(){
//    numberOfCase++;
//    System.out.println("Se está ejecutando el escenario #" + numberOfCase);
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//    System.out.println("Fecha y hora de ejecución: "+dtf.format(LocalDateTime.now()));
//    driver = new ChromeDriver();
//    driver.get("https://www.dian.gov.co/");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @After
//    public void TearDown(Scenario scenario){
//        System.out.println("El escenario # "+ numberOfCase +" se ejecutó correctamente");
////        byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
////        scenario.embed(screenshot, "image/png");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        System.out.println("Fecha y hora ejecución finalizada: "+dtf.format(LocalDateTime.now()));
//        System.out.println("");
//        System.out.println("");
//        driver.quit();
//    }
//
//    public static WebDriver getDriver(){
//        return driver;
//    }
//}
//
