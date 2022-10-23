package Pruebas;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class Compra extends BaseTestSuite{

    @Test
    public void hacer_una_compra() throws InterruptedException {
        firefoxDriver.get("http://automationpractice.com/index.php");

        paginaPrincipal.irASignIn();
        paginaSignIn.iniciarSesion("juantor16@gmail.com","Argentina1");
        paginaPrincipal.seleccionarPestañaTShirt();
        scrollToELement(paginaCategoriaTshirts.imgFadedShortSleeve());
        paginaCategoriaTshirts.comprarFadedShortSleeve();
        paginaSummary.continuarPantallaSummary();
        paginaAddress.continuarPantallaAddress();
        paginaShipping.continuarPantallaShipping();
        paginaPayment.completarPantallaDePagosConCheque();
        Assert.assertTrue(paginaPayment.resultadoDeOrden("Your order on My Store is complete."));


    }


}
