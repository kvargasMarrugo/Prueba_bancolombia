#language: es
#kvargas@qvision.com.co

  Característica: Yo como usuario
    deseo registrarme exitosamente en la pagina utest
   para actualizar mi informacon e interactuar con la pagina

  Escenario: Realizar el registro de u usuario en la pagina utest
    Dado que karelys desea registrarse en la pagina utest
    Cuando ingrese los datos nombre Karelys apellido Vargas email "karelysvargasm@gmail.com" y la fecha de nacimiento "Agosto 05 19900"
    Entonces el registro del usuario sea exitoso
