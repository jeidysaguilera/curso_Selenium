Feature: Trabajo con listas

  Scenario: Obtener un conjunto de elementos de tipo select
    Given Abro el navegador
    When estoy en la pagina principal
    Then Quiero ver todas las opciones de la lista Lets you select multiple options

  Scenario Outline: Obtener un elemento dentro de un conjunto de elementos de tipo select
    Given Abro el navegador
    When estoy en la pagina principal
    Then seleciono el elemento "<opcion>"

    Examples: 
      | opcion   |
      | Option 3 |
      | Option 2 |

  Scenario: Obtener un elemento dentro de un drown
    Given Abro el navegador
    When estoy en la pagina principal
    Then Seleccionar la lista despleglable
    And  dar clic en "Mint"
    
