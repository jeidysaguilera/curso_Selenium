package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithsPage extends BasePage{
	
	
	WebDriver driver;
	
	
	public WithsPage(WebDriver driver) {
		super(driver);
		

	}
	
	By id_search=By.name("q");
	By resultEsperado=By.xpath("//b[contains(text(),'Automatización')]");

	
	public void Escribir(String info) {
		
		type(info, id_search);
		
	}
	
	
	// Método para esperar a que aparezca una palabra específica en los resultados de búsqueda
    public WebElement waitForSpecificWord() {
       return waitForElementVisibility(resultEsperado);
    	
    }
	
	
	
	
	public boolean Encontrado() {
		
	String	result=FindElement(resultEsperado).getText();
	String textoEsperado="Automatización";
		if(result.equals(textoEsperado)) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	
}
