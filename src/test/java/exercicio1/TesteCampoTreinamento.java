package exercicio1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Karen Teste");
		Assert.assertEquals("Karen Teste", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));  // compara o que foi escrito 
		driver.quit();
	}
	
	
	@Test
	public void deveInterarirComTextArea() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste de descrição");
		Assert.assertEquals("Teste de descrição", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value")); //verifica se o valor foi escrito esta correto
		driver.quit();
	}
	
	@Test
	public void deveInterarirComRadioButton() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected()); // aqui ele verificar se o botão foi selecionado 
		driver.quit();
	}
	
	@Test
	public void deveInterarirComCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected()); // aqui ele verificar se o botão foi selecionado 
		driver.quit();
	}
	
	
}
