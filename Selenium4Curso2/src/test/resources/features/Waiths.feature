Feature: Difrentes tipos de esperas

  Scenario: Buscar en Google(Espera Implicita)
    Given El navegador esta abierto
    When Busco Google.com
    And escribo en el buscador "Automatizacion Paso a Paso" presiono Enter
    Then Obtengo el resultado del navegador
