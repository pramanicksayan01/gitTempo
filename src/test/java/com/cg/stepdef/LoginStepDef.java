package com.cg.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.cg.utils.Utils.*;
public class LoginStepDef {
	
	public static WebDriver driver;
	@Before
	public void initi()
	{System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	 driver=new ChromeDriver();	
	 
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	driver.get("https://www.facebook.com/");
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String unm, String pass) {
	 driver.findElement(By.id("email")).sendKeys(unm);
	 driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
	@When("user clicks on button")
	public void user_clicks_on_button() {
	 driver.findElement(By.name("login")).click();  
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	Assert.assertTrue(driver.getTitle().contains("jhjh"));
	}
	
	@Then("user is on same page")
	public void user_is_on_same_page() {
	Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}

	@After
	public void tearDown(Scenario sc)
	{
		if(sc.isFailed())
			captureScreen();
		
		driver.close();
	}
	


}
