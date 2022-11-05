package motoresdebusqueda.dogpile.steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import motoresdebusqueda.dogpile.pageobject.DogPilePaginaResultado;
import motoresdebusqueda.dogpile.pageobject.DogpilePaginaPrincipal;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UsuarioDogPile extends ScenarioActor {
    String actor;


    @Steps(shared = true)
    DogpilePaginaPrincipal paginaPrincipal;
    @Steps(shared = true)
    DogPilePaginaResultado paginaResultado;

    @Step("#actor ingresa a la pagina principal de dogpile")
    public void ingresaADogpile() {
        paginaPrincipal.setDefaultBaseUrl("https://www.dogpile.com/");
        paginaPrincipal.open();
    }


    @Step("#actor realiza una busqueda de: {0}")
    public void buscaPorPalabraClave(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
        paginaPrincipal.realizarBusqueda();
    }


    @Step("#actor deberia poder ver resultados que contengan la palabra: {0}")
    public void deberiaVerResultadosConPalabra(String palabraEsperada) {
        List<String> resultados = paginaResultado.obtenerResultados();
        resultados.replaceAll(String::toLowerCase);
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }

        assertThat(resultados, Matchers.everyItem(containsString(palabraEsperada)));
    }

    @Step("#actor deberia ver un texto: {0} relevante con el titulo: {1}")
    public void deberiaVerResultadoDeTituloConTextoCorrecto(String textoResultadoEsperado,String tituloResultado) {
        String texto = paginaResultado.obtenerTextoDeTituloResultado(tituloResultado);
        System.out.println(texto);
        System.out.println(textoResultadoEsperado);
        assertThat(texto,containsString(textoResultadoEsperado));

    }
}
