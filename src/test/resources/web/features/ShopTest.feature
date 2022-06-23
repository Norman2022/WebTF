Feature: El usuario interactua con el carrito de compras


  Scenario: El usuario finaliza la compra de un item
    Given El usuario se encuentra en la Web Automation Practice
    When El Usuario clickea el Boton "Shop Menu"
    And El usuario clickea en el boton "Add to Basket" del item  "Mastering HTML5 Forms"
    And verifica que se agrega el item al carrito
    And El usuario hace click en carrito y se dirige a la proxima pagina
    And visualiza el precio subtotal  y total
    And el usuario hace click en Checkout
    And el usuario puede encontrar facturación, pedido y detalles adicionales
    And el usuario introduce todos los datos para finalizar la compra
    And el usuario termina la compra haciendo click  en "Place Order"
    Then la pagina muestra el resumen de compra


  Scenario: El usuario finaliza la compra eligiendo India como pais
    Given El usuario se encuentra en la Web Automation Practice
    When El Usuario clickea el Boton "Shop Menu"
    And El usuario clickea en el boton "Add to Basket" del item  "Mastering HTML5 Forms"
    And verifica que se agrega el item al carrito
    And El usuario hace click en carrito y se dirige a la proxima pagina
    And visualiza el precio subtotal  y total
    And el usuario hace click en Checkout
    And el usuario puede encontrar facturación, pedido y detalles adicionales
    And el usuario introduce todos los datos para finalizar la compra
    Then se verifica que los cargos son del 5%
    And el usuario selecciona India como Pais
    Then se verifica que los cargos son del 2%









