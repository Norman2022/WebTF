Feature: El usuario interactua con el carrito de compras

  @Test3
  Scenario: El usuario visualiza un solo item
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el Boton "Shop Menu"
    And El usuario clickea en el item  "Mastering HTML5 Forms"
    Then El usuario visualiza solamente dicho item


  @Test4
  Scenario: El usuario visualiza item por categoria
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el Boton "Shop Menu"
    And El usuario clickea en la categoria "selenium"
    Then El usuario visualiza solamente dichos items
