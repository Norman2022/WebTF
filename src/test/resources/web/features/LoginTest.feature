Feature: El usuario se loguea

  @Test
  Scenario: El usuario se loguea correctamente con credenciales validas
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "My Account" del menú
    And El usuario ingresa su username "nano@gmail.com"
    And El usuario ingresa su password "Testing2022*/"
    And El usuario clickea el boton "Login"
    Then El usuario verifica que ingreso correctamente a la web

  @Test
  Scenario: Login fallido por username y password vacios
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "My Account" del menú
    And El usuario clickea el boton "Login"
    Then El usuario visualiza mensaje de error en la web