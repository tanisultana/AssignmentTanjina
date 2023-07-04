package com.page.objectmodel.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class FacebookTitleTest {
		
	    public WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testPageTitle() {
	        String expectedTitle = "Facebook - Log In or Sign Up";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect");
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	}


