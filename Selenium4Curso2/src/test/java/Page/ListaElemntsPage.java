package Page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListaElemntsPage extends BasePage{
	
	WebDriver driver;

	public ListaElemntsPage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	
	By idSelects=By.name("Optionwithcheck[]");
	By segun_lista=By.id("option");
	By name_drown=By.name("Options");
	By lista_sabor=By.id("datalists");
	By opciones=By.tagName("option");
	
	
	
	public List<WebElement> ListaElemnt(){
		
		Select select=new Select(FindElement(idSelects));
		
		return select.getOptions();
		
	}
	
	
	public List<WebElement> ListaElemnt2(){
		
		Select select=new Select(FindElement(segun_lista));
		
		return select.getOptions();
		
	}
	
	
	public String UnElemtLista(String opcion) {
		
		
		Select select=new Select(FindElement(segun_lista));
		
		select.selectByVisibleText(opcion);
		
		return getText(select.getFirstSelectedOption());
		
		
		
		
		
	}
	
	public void clicLista() {
		
		Clic(name_drown);
	}
	
	public void  Sabor(String sabor) {
		
		
		// Encontrar el elemento input
        WebElement inputElement = FindElement(name_drown);

        // Escribir el valor de la opción que quieres seleccionar
        type(sabor, inputElement);
        
		
	}
	
	
}
