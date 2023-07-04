package com.page.objectmodel.com;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	public class ValidLOgin {
		public WebDriver driver;
		
		@BeforeMethod
		public void Login(){
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");	
		}
		
	    @Test 
	    public void loginWithValidCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum12345");
	    	
	    }
	    
	    @AfterMethod
		public void tearDown() {
		 driver.quit();
		}
	    }


