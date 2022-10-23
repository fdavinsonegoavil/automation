package Pruebas;

import PageObject.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
    protected WebDriver firefoxDriver;
    protected PaginaPrincipal paginaPrincipal;
    protected PaginaSignIn paginaSignIn;
    protected PaginaCategoriaTshirts paginaCategoriaTshirts;
    protected PaginaSummary paginaSummary;
    protected PaginaAddress paginaAddress;
    protected PaginaShipping paginaShipping;
    protected PaginaPayment paginaPayment;

    private void inicializarPagina(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        paginaSignIn = new PaginaSignIn(driver);
        paginaCategoriaTshirts = new PaginaCategoriaTshirts(driver);
        paginaSummary = new PaginaSummary(driver);
        paginaAddress = new PaginaAddress(driver);
        paginaShipping = new PaginaShipping(driver);
        paginaPayment = new PaginaPayment(driver);
    }

    public  void scrollToELement(WebElement elem){
        JavascriptExecutor jse = (JavascriptExecutor) firefoxDriver;
        jse.executeScript("arguments[0].scrollIntoView();", elem);
    }
    @Before
    public void abrir_driver(){
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPagina(firefoxDriver);
    }
    @After
    public void cerrar_driver(){
        firefoxDriver.quit();
    }
}
