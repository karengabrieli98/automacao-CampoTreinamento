package TestedeFrame;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class TestedeFrame {

	@Test
	public void deveInteragirComFrames() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("frameButton")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Frame OK!", msg);
		alert.accept();
		
		driver.switchTo().defaultContent(); //a volta o foco do Selenium para a página principal, saindo de qualquer iframe em que ele estivesse trabalhando.
		driver.findElement(By.id("elementosForm:nome")).sendKeys(msg);
	}
}
