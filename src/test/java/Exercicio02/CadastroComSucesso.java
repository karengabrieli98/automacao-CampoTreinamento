package Exercicio02;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CadastroComSucesso {

	@Test
	public void PreencherCampoNome() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Gabrieli");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Barbosa");
		Assert.assertEquals("Gabrieli", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		Assert.assertEquals("Barbosa", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
		driver.quit();
	}
	@Test
	public void ClicarCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();

	}
	@Test
	public void ClicarGenero() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		driver.quit();

	}
	@Test
	public void SelecionarEscolaridade() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade")); //
		Select combo = new Select(element); //seletc passando o elemento que foi encontrado acima
		combo.selectByVisibleText("2o grau completo"); //pega pelo texto visivel, recomendado  
		Assert.assertEquals("2o grau completo", combo.getFirstSelectedOption().getText()); //valida que a opção selecionada no combo (dropdown) é “2o grau completo”. Se for outra, o teste falha.
		driver.quit();
	}
	
	@Test
	public void SelecionarPraticar() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");	
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		Assert.assertEquals("Natacao", combo.getFirstSelectedOption().getText());
		driver.quit();
	}
	@Test
	public void PreencherSugestoes() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");	
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste01");
		Assert.assertEquals("Teste01", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.quit();		
	}	
	
	@Test
	public void SelecionarVarios() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");	
		
	}
	

}
