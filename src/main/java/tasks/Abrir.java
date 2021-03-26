package tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import utils.Urls;

@Getter
@AllArgsConstructor
public class Abrir implements Task {

  private final String nombrepagina;

  public static Abrir pagina(String nombrepagina) {
    return Tasks.instrumented(Abrir.class, nombrepagina);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(Urls.valueOf(nombrepagina).getURLS()));
  }
}
