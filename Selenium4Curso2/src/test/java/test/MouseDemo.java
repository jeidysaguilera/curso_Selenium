package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		
		
		 WebElement letraA= driver.findElement(By.cssSelector("ul>li[name=\"A\"]"));
		 WebElement letraD= driver.findElement(By.cssSelector("ul>li[name=\"D\"]"));
		 
		 //objeto de tipo actions		 
		 Actions actions=new Actions(driver);
		 
		 //accion para mover el elemento de posicion 		 
		 actions.moveToElement(letraA);
		 
		 
		 //accion para mantener el clic presionado pero sin soltar el elemento
		 actions.clickAndHold();
		 
	//	 actions.moveToElement(letraD);
		 
		 //accion para mantener el clic presionado y luego soltar el elemento
		 actions.dragAndDrop(letraA, letraD);
		 
		 
		 //dar clic derecho sobre un elemento 
//		 actions.contextClick(letraD);
		 //Doble clic en un elemento 
		// actions.doubleClick(letraD);
		 
		 //para q se ejecute la accion y suelte el mouse
		 actions.build().perform();
		 
		 
	}
}
