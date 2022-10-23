package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaShipping {
    @FindBy(css ="#uniform-cgv")
    private WebElement chckBxTerminosYCondiciones;

    @FindBy(xpath = "//button[@type='submit'][@name='processCarrier']")
    private WebElement botonProceedToCheckout;

    public void continuarPantallaShipping(){
        chckBxTerminosYCondiciones.click();
        botonProceedToCheckout.click();
    }
    /*
    WebElement chckBxTerminosYCondiciones = firefoxDriver.findElement(By.cssSelector("#uniform-cgv"));
        chckBxTerminosYCondiciones.click();

        WebElement botonProceedToCheckout4 = firefoxDriver.findElement(By.xpath("//button[@type='submit'][@name='processCarrier']"));
        botonProceedToCheckout4.click();
     */

    public PaginaShipping(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
