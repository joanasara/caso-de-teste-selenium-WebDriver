package cursoSelenio;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPreenchimentoFormulario {

	@Test
	public void testTstField() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Nome");
        Assert.assertEquals("Nome",driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Sobrenome");
		Assert.assertEquals("Sobrenome", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
		
		
		driver.quit();
		
	}
	@Test
	public void testeDeveInteragirTextArea() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste");
		Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click(); //SEXO MASCULINO
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton2() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:1")).click(); //SEXO FEMININO
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton3(){
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click(); //CLICK CARNE
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
		
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton4() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html"); 
		driver.findElement(By.id("elementosForm:comidaFavorita:1")).click(); //CLICK FRANGO
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
		
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton5() {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html"); 
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();  //CLICK PIZZA
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComRadioButton6() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			 
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html"); 
	    driver.findElement(By.id("elementosForm:comidaFavorita:3")).click(); //CLICK VEGETARIANO
	    Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());
		
		driver.quit();
	}
	
	@Test
	public void testeDeveInteragirComCombo() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		   Select combo = new Select(element);
		   combo.selectByVisibleText("2o grau incompleto");
		   
		  Assert.assertEquals("2o grau incompleto", combo.getFirstSelectedOption().getText()); 
		   
		driver.quit();
	}
	
	
	@Test
	public void testeDeveVerificarValorCombo() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		 Select combo = new Select(element);
		 List<WebElement> options = combo.getOptions();
		 Assert.assertEquals(8, options.size());
	  
		 boolean encontrou = false;
		 for(WebElement option: options) {
			 if(option.getText().equals("2o grau incompleto")) {
				encontrou = true; 
				 
				break;
			 }
		 }
		 Assert.assertTrue(encontrou);
		 
		 driver.quit();
	}
	
	
	@Test
	public void testeDeveVerificarValorComboMultiplos() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("Futebol");
		combo.selectByVisibleText("O que eh esporte?");
		
		 List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		 Assert.assertEquals(3, allSelectedOptions.size());
		
		 combo.deselectByVisibleText("Futebol"); //DEIXA DE SELECIONAR UMA ESCOLHAR ESTE COMANDO
		 allSelectedOptions = combo.getAllSelectedOptions();
		 Assert.assertEquals(2, allSelectedOptions.size());
		 
		 driver.quit();
	}
	
	@Test
	public void testeInteragirComBotoes() { 
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
	    driver.findElement(By.id("buttonSimple")).click();
	    WebElement botao = driver.findElement(By.id("buttonSimple"));
		botao.click();
		
		
		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
		
		
		driver.quit();
	}
	
	@Test
	public void testeInteragindoComLinks() { 
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///C:/Users/JOANAS~1/AppData/Local/Temp/Rar$EXa5392.29039/CursoSelenium/target/classes/componentes.html");
	    driver.findElement(By.linkText("Voltar")).click();
	   
	
	
	
	
	
	
	}
	

	
}
