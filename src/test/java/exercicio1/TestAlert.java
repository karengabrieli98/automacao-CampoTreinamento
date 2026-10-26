package exercicio1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestAlert {
	
	@Test
	public void DeveInteragirComAlertSimples() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("alert")).click();
		//driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		String texto = alert.getText();
		Assert.assertEquals("Alert Simples", texto);
		alert.accept();
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys(texto);
		
		driver.quit();
		
   }
	
	@Test
	public void DeveInteragirComAlert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("confirm")).click();

	}
	
	@Test
	public void DeveInteragirComAlertCancelar() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();

	}
}
