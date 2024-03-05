package StepsDefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.WithsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithsSteps {
	
	WebDriver driver=null;
	WithsPage espera;

	
	@Given("El navegador esta abierto")
	public void el_navegador_esta_abierto() {
	    
		espera=new WithsPage(driver);
		driver=espera.ChromeConection();
		
	}

	@When("Busco Google.com")
	public void busco_google_com() {
		
		espera.visitUrl("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@And("escribo en el buscador {string} presiono Enter")
	public void escribo_en_el_buscador_presiono_enter(String string) {
		
		
		espera.Escribir(string);
	   
	}

	@Then("Obtengo el resultado del navegador")
	public void obtengo_el_resultado_del_navegador() {
		
		
		
	    boolean result=espera.Encontrado();
	    
	    //Espera exlpicita
        espera.waitForSpecificWord();
	 
	    assertTrue("Automatización", result);
	    
	    System.out.println(result);
	    espera.Quit();
	}

}
