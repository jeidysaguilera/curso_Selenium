package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MenuDesplegDemo {

	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement select_id=driver.findElement(By.id("option")) ;		
		Select select=new Select(select_id);
		
		//luego puedo seleccionar el elemento por varias opciones
	//	select.selectByIndex(1);
	//	select.selectByValue("option 1");
		select.selectByVisibleText("Option 1");
		
		
		//tambien puedo tener la lista de opciones d las siguioemtes maneras
		
	//	 List<WebElement> lista1=select.getOptions();
		 
		 //en caso de no contruir el objeto select se pude localizar la lista por el locator
		 
		 List<WebElement> lista2=driver.findElements(By.id("option"));
		 
		 for(WebElement iter:lista2) {
			 System.out.println(" las opciones son " + iter.getText());
			 if(iter.getText().equalsIgnoreCase("option 2")) {
				 iter.click();
			 }
		 }
	}
}
