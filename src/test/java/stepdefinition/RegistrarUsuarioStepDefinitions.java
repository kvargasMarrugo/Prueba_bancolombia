package stepdefinition;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;

public class RegistrarUsuarioStepDefinitions {

  @Cuando("ingrese los datos nombre {word} apellido {word} email {string} y la fecha de nacimiento {string}")
  public void diligenciarDatosUsario(String nombre, String apellido, String email, String fechanacimiento) {}

  @Entonces("^el registro del usuario sea exitoso$")
  public void registrarUsario() {}
}
