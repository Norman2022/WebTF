Feature: El usuario intenta registrarse

  @Test
  Scenario: El Usuario falla en registrarse por password vacio
    Given El Usuario se encuentra en la web Automation Practice
    When El usuario hace clic en  el Boton "My Account" del menu
    And El usuario ingresa un email valido "tito2022@gmail.com"
    And El usuario hace clic en el boton "REGISTER"
    Then El usuario visualiza el error "Please enter an account password."

  @Test
  Scenario: El usuario falla en registrarse por email invalido
    Given El Usuario se encuentra en la web Automation Practice
    When El usuario hace clic en  el Boton "My Account" del menu
    And El usuario ingresa un email invalido "tito2022@gmail"
    And El usuario ingresa un password valido "Testing2022**//"
    And El usuario hace clic en el boton "REGISTER"
    Then El usuario visualiza el error de email "Please provide a valid email address."

