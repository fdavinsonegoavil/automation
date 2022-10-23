package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSignIn {
    @FindBy(css = "#email")
    private WebElement txtEmail;
    @FindBy(css = "#passwd")
    private WebElement txtPasswd;
    @FindBy(css = "#SubmitLogin")
    private WebElement btnSignInCandado;

    public void iniciarSesion(String strEmail, String strPassw){
        txtEmail.sendKeys(strEmail);
        txtPasswd.sendKeys(strPassw);
        btnSignInCandado.click();
    }

    public PaginaSignIn(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
