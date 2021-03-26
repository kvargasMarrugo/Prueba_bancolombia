package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConfiguracionInicial {

  @Before
  public void configurarActor() {
    setTheStage(new OnlineCast());
    theActorCalled("Karelys");
  }

  @Dado("que karelys desea registrarse en la pagina {word}")
  public void ingresarPagina(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina));
  }
}
