Feature: El usuario intenta registrarse

Background:
  Given El Usuario se encuentra en la web Automation Practice
  When El usuario hace clic en  el Boton "My Account" del menu


  Scenario: El Usuario falla en registrarse por password vacio
    And El usuario ingresa un email valido "tito2022@gmail.com"
    And El usuario hace clic en el boton "REGISTER"
    Then El usuario visualiza el error "Please enter an account password."



  Scenario: El usuario falla en registrarse por email y password vacio
    And El usuario hace clic en el boton "REGISTER"
    Then El usuario visualiza el error de email "Please provide a valid email address."

