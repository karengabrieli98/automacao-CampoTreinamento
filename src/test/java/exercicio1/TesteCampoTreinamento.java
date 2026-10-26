package exercicio1;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	public void deveInteragirComTextArea() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste de descrição");
		Assert.assertEquals("Teste de descrição", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value")); //verifica se o valor foi escrito esta correto
		driver.quit();
	}
	
	@Test
	public void deveInteragirComRadioButton() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected()); // aqui ele verificar se o botão foi selecionado 
		driver.quit();
	}
	
	@Test
	public void deveInteragirComCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected()); // aqui ele verificar se o botão foi selecionado 
		driver.quit();
	}
	
	@Test
	public void deveInteragirComCombo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		//driver.findElement(By.id("elementosForm:comidaFavorita:2")).click(); //o selenium retorna sempre que busco um elemento 
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade")); //
		Select combo = new Select(element); //seletc passando o elemento que foi encontrado acima
		//combo.selectByIndex(3);
		//combo.selectByValue("superior");
		combo.selectByVisibleText("2o grau completo"); //pega pelo texto visivel, recomendado  
		Assert.assertEquals("2o grau completo", combo.getFirstSelectedOption().getText());
		driver.quit();
	}
	
	@Test
	public void deveVerificarValoresCombo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
		//driver.findElement(By.id("elementosForm:comidaFavorita:2")).click(); //o selenium retorna sempre que busco um elemento 
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade")); //
		Select combo = new Select(element); //seletc passando o elemento que foi encontrado acima
		List<WebElement> options = combo.getOptions(); // me retorna uma lista de WebElements
		Assert.assertEquals(8, options.size()); // verifiquei que 8 é extamento o tamanho ou  se a minha opção existe la lista
		
		boolean encontrou = false; //logica para indicar se ele achou a lista de opcoes
		for(WebElement option: options) {
			if(option.getText().equals("Mestrado")) {  // se a opcao corrente do texto for igual a mestrado, entao encontrou sera verdadeiro
				encontrou = true;
				break;
			}
		}
		Assert.assertTrue(encontrou);
		
		driver.quit();
	}		
		
		@Test
		public void deveVerificarValoresComboMultiplo() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
			//driver.findElement(By.id("elementosForm:comidaFavorita:2")).click(); //o selenium retorna sempre que busco um elemento 
			WebElement element = driver.findElement(By.id("elementosForm:esportes")); //
			Select combo = new Select(element); //seletc passando o elemento que foi encontrado acima
			combo.selectByVisibleText("Natacao");
			combo.selectByVisibleText("Corrida");
			combo.selectByVisibleText("O que eh esporte?");
			
			List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
			Assert.assertEquals(3, allSelectedOptions.size() ); // verifiquei que 8 é extamento o tamanho ou  se a minha opção existe la lista
				
			driver.quit();
		
	}
		
		@Test
		public void deveInteragirComBotao() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
			WebElement botao = driver.findElement(By.id("buttonSimple")); //instancia de webelemente, retorno do find
			botao.click();
			
			Assert.assertEquals("Obrigado", botao.getAttribute("valeu"));
			driver.quit();
		}
		
		@Test
		//@Ignore // ele diz para o junit nao executar esse teste 
		public void deveInteragirComLink() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
			driver.findElement(By.linkText("Voltar")).click();
			Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
			//Assert.fail(); // vai falhar o teste
			driver.quit();
		}
		
		@Test
		public void deveBuscarTextoNaPagina() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("file:///C:/Users/karen/Downloads/campo_treinamento%20(1)/componentes.html");
			//Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento")); // encontrou o body, pegou o texto complento do body e partir desse texto foi verifica a String "Campo de treinamento"
			Assert.assertEquals("Campo de Treinamento", driver.findElement(By.tagName("h3")).getText());
			Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", driver.findElement(By.className("facilAchar")).getText());
			
			driver.quit();
		
		}
	
}
