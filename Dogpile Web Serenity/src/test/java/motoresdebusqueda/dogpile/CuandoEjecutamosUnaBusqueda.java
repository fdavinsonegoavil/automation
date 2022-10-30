package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoEjecutamosUnaBusqueda {

    @Steps
    UsuarioDogPile Frank;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamos_ver_resultados_relevantes(){
        Frank.ingresar_a_dogpile();

        Frank.busca_por_palabra_clave("rock nacional");

        Frank.deberia_ver_resutlados_con_palabra("rock");
    }
}
