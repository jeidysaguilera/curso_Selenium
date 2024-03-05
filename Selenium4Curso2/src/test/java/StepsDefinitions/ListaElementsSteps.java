package StepsDefinitions;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Page.ListaElemntsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ListaElementsSteps {
	
	
	WebDriver driver=null;
	ListaElemntsPage lista;
	
	@Given("Abro el navegador")
	public void abro_el_navegador() {
		
		lista=new ListaElemntsPage(driver);
		driver=lista.ChromeConection();
	   
	}
	@When("estoy en la pagina principal")
	public void estoy_en_la_pagina_principal() {
	    lista.visitUrl("https://trytestingthis.netlify.app/");
	}

	@Then("Quiero ver todas las opciones de la lista Lets you select multiple options")
	public void quiero_ver_todas_las_opciones_de_la_lista_lets_you_select_multiple_options() {
		
		
		List<WebElement>lisnew=lista.ListaElemnt2();
		
		for(WebElement options:lisnew) {
			
			System.out.println("las opciones son "+ options.getText());
			
		}
		lista.Quit();
	    
	}
	
	@Then("seleciono el elemento {string}")
	public void seleciono_el_elemento(String string) {
	
		String opcion=lista.UnElemtLista(string);
		System.out.println("La opcion eleida es" + opcion);
		
	}
	
	
	
	@Then("Seleccionar la lista despleglable")
	public void seleccionar_la_lista_despleglable() {
		
	    lista.clicLista();
	}

	@Then("dar clic en {string}")
	public void dar_clic_en(String string) {
		lista.Sabor(string);
	  
	   System.out.println("el sabor q quiero es " + string);
	}

	
	
}