package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaAddress {
    @FindBy(xpath = "//button[@type='submit'][@name='processAddress']")
    private WebElement botonProceedToCheckout;

    public void continuarPantallaAddress(){
        botonProceedToCheckout.click();
    }
        /*
    WebElement botonProceedToCheckout3 = firefoxDriver.findElement(By.xpath("//button[@type='submit'][@name='processAddress']"));
        botonProceedToCheckout3.click();
     */

    public PaginaAddress(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
