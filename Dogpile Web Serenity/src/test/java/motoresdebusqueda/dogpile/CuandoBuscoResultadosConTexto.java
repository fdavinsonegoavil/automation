package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoBuscoResultadosConTexto {
    @Steps
    UsuarioDogPile Frank;

    @Managed
    WebDriver driver;


    @Test
    public void resultado_de_wikipedia_contiene_texto_correcto(){
        Frank.ingresa_a_dogpile();
        Frank.busca_por_palabra_clave("argentine rock");
        Frank.deberia_ver_resultado_de_titulo_con_texto_correcto("Argentine rock - Wikipedia"," and roll first began to appear in ");

    }
}
