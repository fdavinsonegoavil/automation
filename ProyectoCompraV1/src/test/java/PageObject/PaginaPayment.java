package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPayment {

    @FindBy(css = ".cheque")
    private WebElement botonCheque;
    @FindBy(css = ".bankwire")
    private WebElement botonBankWire;
    @FindBy(xpath = "//p/button[@type='submit']")
    private WebElement botonConfirmarMiCompra;
    @FindBy(className = "alert")
    private WebElement bannerOrdenCompra;


    /*
    WebElement bannerOrdenCompra = firefoxDriver.findElement(By.className("alert"));

        Assert.assertTrue(bannerOrdenCompra.isDisplayed());
        Thread.sleep(4000);
     */
    public boolean resultadoDeOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerOrdenCompra.getText());
        return mensaje.equals(bannerOrdenCompra.getText());
    }

    public void completarPantallaDePagosConCheque(){
        botonCheque.click();
        botonConfirmarMiCompra.click();
    }
    public PaginaPayment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
