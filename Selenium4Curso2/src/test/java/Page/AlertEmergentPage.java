package Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AlertEmergentPage extends BasePage{

	WebDriver driver;
	
	public AlertEmergentPage(WebDriver driver) {
		super(driver);
		
	}

	By AlertEmerg=By.xpath("//button[@onclick=\"jsAlert()\"]");
	By JSConfirm=By.xpath("//button[@onclick=\"jsConfirm()\"]");
	By JSPront=By.xpath("//button[@onclick=\"jsPrompt()\"]");
	
	By id_Result=By.id("result");
	
	
	
	
	public void ClicAlertScript() {
		
		Clic(AlertEmerg);
	}
	
    public void ClicJSConfirm() {
		
		Clic(JSConfirm);
	}
	
    public void ClicPrompt() {
	
	Clic(JSPront);
      }
	
	//cambiar el punto del controlador a alerta y dar aceptar
	
	public void AceptarVentanEmergente() {
		
		Alert().accept();
		
	}
	//cambiar el punto del controlador a alerta y dar cancelar
	
		public void CancelarVentanEmergente() {
			
			Alert().dismiss();
			
		}
		
		
		//cambiar el punto del controlador a alerta y escribir
		
		public void EscribiPrompt() {
			Alert().sendKeys("Jeidys Aguilera");
			
			
		}
	
	public void TextResultAlert() {
		
		String text="You successfully clicked an alert";
		assertEquals(text, FindElement(id_Result).getText());
	}
	
     public void TextResultConfirm() {
		
		String text="You clicked: Ok";
		assertEquals(text, FindElement(id_Result).getText());
	}
     public void TextResultCancel() {
 		
 		String text="You clicked: Cancel";
 		assertEquals(text, FindElement(id_Result).getText());
 	}
     public void TextResultPrompt() {
  		
  		String text="You entered: Jeidys Aguilera";
  		assertEquals(text, FindElement(id_Result).getText());
  	}
    
	
    
	
	public String TextAlert() {
		return Alert().getText();
	}
	
}
