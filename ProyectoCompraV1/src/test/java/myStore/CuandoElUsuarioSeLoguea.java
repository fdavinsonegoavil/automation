package myStore;


import myStore.acciones.Decidido;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoElUsuarioSeLoguea {
    Actor actor;
    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario(){
        actor =  Actor.named("Daniela");

        actor.can(BrowseTheWeb.with(navegador));
    }
    @Test
    public void ingresarAMyAccountCorrectamente(){

        actor.has(Decidido.ingresarConUsuarioYContraseña());
    }
}
