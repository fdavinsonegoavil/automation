package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCategoriaTshirts {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='product-image-container']")
    private WebElement fadedShortSleeve;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement botonAgregarCarrito;
    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    private WebElement botonCheckout;

    public void comprarFadedShortSleeve() throws InterruptedException{
        Actions actions = new Actions(this.driver);
        actions.moveToElement(fadedShortSleeve).moveToElement(botonAgregarCarrito).doubleClick().perform();
        Thread.sleep(2000);
        botonCheckout.click();

    }
    public WebElement imgFadedShortSleeve(){
        return fadedShortSleeve;
    }
    public PaginaCategoriaTshirts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
