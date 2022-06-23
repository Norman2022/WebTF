@Test
Feature: El usuario interactua con el menu cuenta

Background:
    Given El usuario se encuentra en la web Automation Practice
    When El usuario hace clic en  el Boton "My Account" del menu


    Scenario Outline: El usuario se loguea y ve los detalles de su cuenta
      And el usuario ingresa username'<username>' y password'<password>'
      And el usuario presiona el boton Login
      Then el usuario se loguea exitosamente
      And El usuario hace clic en  el Boton "My Account" del menu
      And el usuario hace clic en 'Account Details'
      Then el usuario ve los detalles de su cuenta y puede cambiar su password

    Examples:
      | username       | password      |
      | nano@gmail.com | Testing2022*/ |


  Scenario Outline: El usuario se loguea y se desloguea
    And el usuario ingresa username'<username>' y password'<password>'
    And el usuario presiona el boton Login
    Then el usuario se loguea exitosamente
    And El usuario hace clic en  el Boton "My Account" del menu
    And el usuario hace clic en el  boton 'Logout'
    Then el usuario se desloguea exitosamente


    Examples:
      | username       | password      |
      | nano@gmail.com | Testing2022*/ |