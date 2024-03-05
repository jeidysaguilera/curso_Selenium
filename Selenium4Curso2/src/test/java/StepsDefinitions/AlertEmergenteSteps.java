package StepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Page.AlertEmergentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertEmergenteSteps {
	
	WebDriver driver=null;
	AlertEmergentPage alerta;
	
	
	@Given("abro la pagina de inicio de Scripts Alerts")
	public void abro_la_pagina_de_inicio_de_scripts_alerts() {
		
		alerta=new AlertEmergentPage(driver);
		driver=alerta.ChromeConection();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		alerta.visitUrl("https://the-internet.herokuapp.com/javascript_alerts");
	    
	}

	@When("doy clic en JS Alert")
	public void doy_clic_en_js_alert() {
	    alerta.ClicAlertScript();
	}

	@Then("se cierra la ventana emergente al dar clic en Aceptar")
	public void se_cierra_la_ventana_emergente_al_dar_clic_en_aceptar() {
		
		 String text=alerta.TextAlert();
		 System.out.println("El texto de la alerta es" + text);
		 
		alerta.AceptarVentanEmergente();
		
	   
	}
	@And("chequear el texto de confirmacion")
	public void chequear_el_texto_de_confirmacion() throws InterruptedException {
		  
	
	     alerta.TextResultAlert();
	   
		alerta.Quit();
	}

	

@When("doy clic en JS Confirm")
public void doy_clic_en_js_confirm() {
    alerta.ClicJSConfirm();
}

@Then("se cierra la ventana emergente al dar clic en Confirmar")
public void se_cierra_la_ventana_emergente_al_dar_clic_en_confirmar() {
	
	String text=alerta.TextAlert();
	 System.out.println("El texto del cuadro de confrimacion es" + text);
	 
	alerta.AceptarVentanEmergente();
}

@Then("chequear el texto de confirmacion del JS Confirm")
public void chequear_el_texto_de_confirmacion_del_js_confirm() {
    alerta.TextResultConfirm();
    
    alerta.Quit();
}


@Then("se cierra la ventana emergente al dar clic en Cancelar")
public void se_cierra_la_ventana_emergente_al_dar_clic_en_cancelar() {
	
	String text=alerta.TextAlert();
	 System.out.println("El texto del cuadro de cancelacion es" + text);
	 
	alerta.CancelarVentanEmergente();

}

@Then("chequear el texto de Cancelacion")
public void chequear_el_texto_de_cancelacion() {
	
	 alerta.TextResultCancel();
	 alerta.Quit();
}

@When("doy clic en JS Prompt")
public void doy_clic_en_js_prompt() {
    alerta.ClicPrompt();
}

@Then("Escribo mi nombre en el cuadro de texto")
public void escribo_mi_nombre_en_el_cuadro_de_texto() {
   alerta.EscribiPrompt();
}

@Then("chequear el texto de la pantalla")
public void chequear_el_texto_de_la_pantalla() {
	
	alerta.TextResultPrompt();
	alerta.Quit();
    
}

	
}
