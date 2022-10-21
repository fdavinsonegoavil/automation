import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Compra {
    private WebDriver firefoxDriver;

    @Before
    public void abrir_driver(){
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void hacer_una_compra() throws InterruptedException {
        firefoxDriver.get("http://automationpractice.com/index.php");

        WebElement btnSignIn = firefoxDriver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        btnSignIn.click();

        WebElement inputEmail = firefoxDriver.findElement(By.cssSelector("#email"));
        inputEmail.sendKeys("juantor16@gmail.com");

        WebElement inputContraseña = firefoxDriver.findElement(By.cssSelector("#passwd"));
        inputContraseña.sendKeys("Argentina1");

        WebElement btnSignInCandado = firefoxDriver.findElement(By.cssSelector("#SubmitLogin"));
        btnSignInCandado.click();
        //________________________Proceso ya estando logueado__________________________

        WebElement pestañaTShirts = firefoxDriver.findElement(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']"));
        pestañaTShirts.click();

        //________________________ACTIONS_______________________________________________


        WebElement imagenDeCompra = firefoxDriver.findElement(By.xpath("//div[@class='product-image-container']"));
        JavascriptExecutor jse = (JavascriptExecutor)firefoxDriver;
        jse.executeScript("arguments[0].scrollIntoView();", imagenDeCompra);

        WebElement botonAddToCar = firefoxDriver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));

        Actions action = new Actions(firefoxDriver);
        action.moveToElement(imagenDeCompra).moveToElement(botonAddToCar).doubleClick().perform();
        Thread.sleep(3000);

        WebElement botonDeCompra1 = firefoxDriver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        botonDeCompra1.click();

        //p//*[contains(text(),'Proceed to checkout')]
        WebElement botonProceedToCheckout = firefoxDriver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
        botonProceedToCheckout.click();

        WebElement botonProceedToCheckout3 = firefoxDriver.findElement(By.xpath("//button[@type='submit'][@name='processAddress']"));
        botonProceedToCheckout3.click();

        WebElement chckBxTerminosYCondiciones = firefoxDriver.findElement(By.cssSelector("#uniform-cgv"));
        chckBxTerminosYCondiciones.click();

        WebElement botonProceedToCheckout4 = firefoxDriver.findElement(By.xpath("//button[@type='submit'][@name='processCarrier']"));
        botonProceedToCheckout4.click();

        WebElement botonCheque = firefoxDriver.findElement(By.cssSelector(".cheque"));
        botonCheque.click();

        WebElement botonConfirmarMiCompra = firefoxDriver.findElement(By.xpath("//p/button[@type='submit']"));
        botonConfirmarMiCompra.click();

        WebElement bannerOrdenCompra = firefoxDriver.findElement(By.className("alert"));

        Assert.assertTrue(bannerOrdenCompra.isDisplayed());
        Thread.sleep(4000);
    }

    @After
    public void cerrar_driver(){
        firefoxDriver.quit();
    }
}
