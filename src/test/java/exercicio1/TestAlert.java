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
		WebDriver driver = new ChromeDriver(); // Abre uma nova janela do Chrome controlada pelo Selenium. O driver é o objeto que você usa para mandar comandos ao navegador.
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("confirm")).click(); //Localiza o elemento da página cujo id é confirm (um botão) e clica nele. Esse clique dispara um alert do tipo confirm (com OK e Cancelar).
		Alert alerta = driver.switchTo().alert(); //Alerts JavaScript não fazem parte do HTML, então o Selenium não os enxerga como elementos normais. O switchTo().alert() muda o foco do driver para o alert aberto e guarda uma referência a ele na variável alerta.
		Assert.assertEquals("Confirm Simples", alerta.getText()); //Lê o texto exibido no alert (getText()) e verifica se é igual a “Confirm Simples”. Se for diferente, o teste falha. É a validação de que o alert certo apareceu.
		alerta.accept(); //Clica em OK no alert. Isso fecha o primeiro alert, e a página então mostra um segundo alert com o resultado.
		Assert.assertEquals("Confirmado", alerta.getText()); //Verifica se o texto do segundo alert é “Confirmado”, provando que a página reagiu ao OK como esperado.
		alerta.accept(); //Fecha o segundo alert, também clicando em OK.
		
		
		driver.findElement(By.id("confirm")).click();
		alerta = driver.switchTo().alert(); 
		Assert.assertEquals("Confirm Simples", alerta.getText()); 
		alerta.dismiss();
		Assert.assertEquals("Negado", alerta.getText()); 
		alerta.dismiss();
		driver.quit();
	}
	
	@Test
	public void DeveInteragirComAlertPrompt() {
		WebDriver driver = new ChromeDriver(); // Abre uma nova janela do Chrome controlada pelo Selenium. O driver é o objeto que você usa para mandar comandos ao navegador.
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("prompt")).click();
		Alert alerta = driver.switchTo().alert();
		Assert.assertEquals("Digite um numero", alerta.getText());
		alerta.sendKeys("12");
		alerta.accept();
		Assert.assertEquals("Era 12?", alerta.getText());
		alerta.accept();
		Assert.assertEquals(":D", alerta.getText());
		alerta.accept();
		
		driver.quit();
 }
}
