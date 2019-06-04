package com.sicredi.Test.com.sicredi.Selenium;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class Desafio_1_Test {
  private WebDriver driver;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");  
	driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }
  
  
  @After
  public void tearDown() {
  	driver.close();  
  }
  /* Passo 7 */
  
  @Test
  public void Primeiro() {
	    driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
	    /* Passo 1 */
	    
	    driver.findElement(By.id("switch-version-select")).click();
	    {
	      WebElement dropdownVersion = driver.findElement(By.id("switch-version-select"));
	      dropdownVersion.findElement(By.xpath("//option[. = 'Bootstrap V4 Theme']")).click();
	    }
	    /* Passo 2 */
	    
	    driver.findElement(By.xpath("//a[@class = 'btn btn-default btn-outline-dark']")).click();
	    /* Passo 3 */
	    
	    
	    /* 
	     * Devido a um erro bizantino, ocorre por vezes que um elemento torna-se inacessível; isso ocorre de forma aleatória,
	     * com campos distintos. Associo o problema à questões de memória. O Implicit Wait está acompanhando cada um dos casos
	     * devido a isso, em conjunto com os Explicit Waits associados a cada campo.
	     */
	    
	    WebDriverWait load = new WebDriverWait(driver,1);
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-customerName")));
	    if ((driver.findElement(By.id("field-customerName")).isEnabled())&&
	    		(driver.findElement(By.id("field-customerName")).getAttribute("value").isEmpty()))
	    {
	    
	    	driver.findElement(By.id("field-customerName")).click();
	    	driver.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-contactLastName")));
	    if ((driver.findElement(By.id("field-contactLastName")).isEnabled())&&
	    		(driver.findElement(By.id("field-contactLastName")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-contactLastName")).click();
	    driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-contactFirstName")));
	    if ((driver.findElement(By.id("field-contactFirstName")).isEnabled())&&
	    		(driver.findElement(By.id("field-contactFirstName")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-contactFirstName")).click();
	    driver.findElement(By.id("field-contactFirstName")).sendKeys("Marcelo");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-phone")));
	    if ((driver.findElement(By.id("field-phone")).isEnabled())&&
	    		(driver.findElement(By.id("field-phone")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-phone")).click();
	    driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-addressLine1")));
	    if ((driver.findElement(By.id("field-addressLine1")).isEnabled())&&
	    		(driver.findElement(By.id("field-addressLine1")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-addressLine1")).click();
	    driver.findElement(By.id("field-addressLine1")).sendKeys("Av. Assis Brasil, 3970");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-addressLine2")));
	    if ((driver.findElement(By.id("field-addressLine2")).isEnabled())&&
	    		(driver.findElement(By.id("field-addressLine2")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-addressLine2")).click();
	    driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-city")));
	    if ((driver.findElement(By.id("field-city")).isEnabled())&&
	    		(driver.findElement(By.id("field-city")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-city")).click();
	    driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-state")));
	    if ((driver.findElement(By.id("field-state")).isEnabled())&&
	    		(driver.findElement(By.id("field-state")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-state")).click();
	    driver.findElement(By.id("field-state")).sendKeys("RS");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-postalCode")));
	    if ((driver.findElement(By.id("field-postalCode")).isEnabled())&&
	    		(driver.findElement(By.id("field-postalCode")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-postalCode")).click();
	    driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-country")));
	    if ((driver.findElement(By.id("field-country")).isEnabled())&&
	    		(driver.findElement(By.id("field-country")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-country")).click();
	    driver.findElement(By.id("field-country")).sendKeys("Brasil");
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_salesRepEmployeeNumber_chosen")));
	    driver.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
	    if ((driver.findElement(By.xpath("//div[@class = 'chosen-search']/input")).isEnabled())&&
	    		(driver.findElement(By.xpath("//div[@class = 'chosen-search']/input")).getAttribute("value").isEmpty()))
	    {	
	    driver.findElement(By.xpath("//div[@class = 'chosen-search']/input")).sendKeys("Fixter");
	    driver.findElement(By.xpath("//div[@class = 'chosen-search']/input")).sendKeys(Keys.RETURN);
	    }
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-creditLimit")));
	    if ((driver.findElement(By.id("field-creditLimit")).isEnabled())&&
	    		(driver.findElement(By.id("field-creditLimit")).getAttribute("value").isEmpty()))
	    {
	    driver.findElement(By.id("field-creditLimit")).click();
	    driver.findElement(By.id("field-creditLimit")).sendKeys("200");
	    }
	    
	    /* Passo 4 */
	    
	    load.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-button-save")));
	    driver.findElement(By.id("form-button-save")).click();
	    /* Passo 5 */
	    
	    
	    /*
	     * Wait necessário devido ao delay, às vezes bastante variável, de exibição da mensagem.
	     */
	    
	    WebDriverWait wait = new WebDriverWait(driver,3);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id= 'report-success']/p")));
	    
	    WebElement Success = driver.findElement(By.xpath(".//div[@id = 'report-success']/p"));
	    String SuccessMessage = Success.getText();
	    Assert.assertTrue(SuccessMessage.contains("Your data has been successfully stored into the database. "));
	    System.out.print("\n" + SuccessMessage + "\n");
	    
	    /* Passo 6 */
  }
}
