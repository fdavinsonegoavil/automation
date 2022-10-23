package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {
    WebDriver driver;
    @FindBy(className = "login")
    private WebElement btnSigIn;
    @FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
    private WebElement pestañaTShirts;


    public void irASignIn(){
        btnSigIn.click();
    }

    public void seleccionarPestañaTShirt(){
        pestañaTShirts.click();
    }
    public void posicionarseEnLaImagenYSeleccionarAddCar(){

    }

    public PaginaPrincipal(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
