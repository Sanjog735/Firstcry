package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Login {
	WebDriver driver;
	LoginPage login;
	
	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
	}

	@Given("The user is in the firstcry home page")
	public void the_user_is_in_the_firstcry_home_page() {
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@And("The user enters the mobile number")
	public void the_user_enters_the_mobile_number() throws InterruptedException {
		login.sendMobileNumber();

	}

	@Then("click on continue")
	public void click_on_continue() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@And("The user provides otp")
	public void the_user_provides_otp() {
		System.out.println("OTP");
	}

	@And("click on submit")
	public void click_on_submit() throws InterruptedException {
		login.clickOnSubmitButton();

	}

	@Then("The user must able to login")
	public void the_user_must_able_to_login() {
		Assert.assertTrue(driver.getPageSource().contains("My Account"));
		driver.close();
	}
}
