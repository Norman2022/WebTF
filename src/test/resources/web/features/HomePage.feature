Feature: El usuario iteractua con el carrito de compras



  Scenario: El usuario agrega un item al carrito y selecciona metodo de pago
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "Shop" del menú
    And El usuario clickea el botón "Home" del menu
    And Se verifica que solo se vea tres item
    And el usuario hace clic en el item "Selenium"
    And verifica que se esta navegando en la pagina siguiente
    And El usuario clickea el botón "Add to Basket"
    And verifica que se agrega al carrito
    And El usuario hace click en "View Basket"
    And visualiza el precio subtotal  y total
    And el usuario hace click en Checkout
    Then el usuario puede encontrar facturación, pedido y detalles adicionales



  Scenario: El usuario agrega un item al carrito y  se finaliza la compra
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "Shop" del menú
    And El usuario clickea el botón "Home" del menu
    And Se verifica que solo se vea tres item
    And El usuario clickea el botón "Shop" del menú
    And el usuario hace clic en el item "HTML5 Forms"
    And verifica que se esta navegando en la pagina siguiente
    And El usuario clickea el botón "Add to Basket"
    And verifica que se agrega al carrito
    And El usuario hace click en "View Basket"
    And visualiza el precio subtotal  y total
    And el usuario hace click en Checkout
    And el usuario puede encontrar facturación, pedido y detalles adicionales
    And el usuario introduce todos los datos para finalizar la compra
    And el usuario termina la compra haciendo click  en "Place Order"

