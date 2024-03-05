Feature: Manejo de alertas Scripts

  Scenario: Alerta de mensaje Script
    Given abro la pagina de inicio de Scripts Alerts
    When doy clic en JS Alert
    Then se cierra la ventana emergente al dar clic en Aceptar
    And chequear el texto de confirmacion

  Scenario: Cuadro de Confirmacion, Confirmar
    Given abro la pagina de inicio de Scripts Alerts
    When doy clic en JS Confirm
    Then se cierra la ventana emergente al dar clic en Confirmar
    And chequear el texto de confirmacion del JS Confirm 

  Scenario: Cuadro de Confirmacion, Cancelar
    Given abro la pagina de inicio de Scripts Alerts
    When doy clic en JS Confirm
    Then se cierra la ventana emergente al dar clic en Cancelar
    And chequear el texto de Cancelacion

    Scenario: Escribir Mensaje en el Prompt
    Given abro la pagina de inicio de Scripts Alerts
    When doy clic en JS Prompt
    Then Escribo mi nombre en el cuadro de texto
    And se cierra la ventana emergente al dar clic en Aceptar
    And chequear el texto de la pantalla