package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSummary {

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement botonProceedToCheckout;

    public void continuarPantallaSummary(){
        botonProceedToCheckout.click();
    }

    public PaginaSummary(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
