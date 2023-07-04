package com.page.objectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationPageObjectModel {
    private WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordInput;

    @FindBy(id = "registerButton")
    private WebElement registerButton;

    public RegistrationPageObjectModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

@BeforeTest

public void setUp() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://tutorialsninja.com/demo/");
}

@Test
public void testRegistrationWithValidCredentials() {
    RegistrationPageObjectModel registrationPage = new RegistrationPageObjectModel(driver);
    registrationPage.enterFirstName("Jina");
    registrationPage.enterLastName("Jahan");
    registrationPage.enterEmail("jinajahan@gmail.com");
    registrationPage.enterPassword("Begum12345");
    registrationPage.enterConfirmPassword("Begum12345");
    registrationPage.clickRegisterButton();
    Assert.assertTrue(driver.getTitle().contains("Your Account Has Been Created!"));
}

@AfterTest
public void tearDown() {
    driver.quit();
}
}
	    
	


