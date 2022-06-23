
Feature: Login exitoso y uno fallido

Background:
    Given El usuario se encuentra en la web Automation Practice
    When El usuario hace clic en  el Boton "My Account" del menu


    Scenario Outline: El usuario no se loguea correctamente por uso de mayusculas
      And el usuario ingresa username'<username>' y password'<password>' en mayusculas
      And el usuario presiona el boton Login
      Then visualiza error por password incorrecto
    Examples:
      | username       | password      |
      | nano@gmail.com | Testing2022/* |


    Scenario: El usuario se loguea y desloguea correctamente y vuelve hacia atras
        And el usuario ingresa username en mayusculas
        And el usuario presiona el boton Login
        And el usuario se desloguea y presiona Atras
        Then el usuario debe ver el formulario de Login