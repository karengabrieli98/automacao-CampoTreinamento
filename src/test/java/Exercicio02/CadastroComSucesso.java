package Exercicio02;

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
		driver.quit();
	}
	@Test
	public void ClicarCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.quit();

	}
	@Test
	public void ClicarGenero() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
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
		driver.quit();
	}
	@Test
	public void PreencherSugestoes() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");	
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste01");
		driver.quit();		
	}	
	
	@Test
	public void SelecionarVarios() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");	
		
	}
}
