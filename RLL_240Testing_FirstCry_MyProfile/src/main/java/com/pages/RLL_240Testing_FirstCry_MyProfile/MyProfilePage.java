package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfilePage {

	WebDriver driver;

	public MyProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	By myAccount = By.xpath("//span[text()='My Account']");
	By myProfile = By.xpath("(//a[text()='My Profile'])[2]");
	public void clickOnMyAccount() throws InterruptedException {
		driver.findElement(myAccount).click();
		Thread.sleep(2000);
	}
	public void clickOnMyProfile() throws InterruptedException {
		driver.findElement(myProfile).click();
		Thread.sleep(2000);
	}

	// My Profile
	By profileEditIcon = By.cssSelector("div[id='parent_1']");
	By profileName = By.cssSelector("input[id='userFnLName']");
	By profile_i_am = By.id("userGenderMale");
	By exp_Child_checkBox = By.xpath("//div[@class='seml']/span[@class='sprite-listing sp_ck1' and @data-val='N']");
	By profileDateBtn = By.xpath("(//input[@id='ExpChldDOBTop'])[1]");

	By profieDate = By.xpath("//div[contains(@class, 'core border selected') and text()='30']");
	By profileSave = By.id("UpdateUserInfo");

	public void clickOnProfileEditIcon() throws InterruptedException {
		driver.findElement(profileEditIcon).click();
		Thread.sleep(2000);
	}

	public void enterName(String name) throws InterruptedException {
		WebElement enterNameElement = driver.findElement(profileName);
		enterNameElement.clear();
		Thread.sleep(500);
		enterNameElement.sendKeys(name);
	}

	public void clickOnProfileIAm() throws InterruptedException {
		driver.findElement(profile_i_am).click();
		Thread.sleep(2000);
	}

	public void clickOnExpectingChildCheckBox() throws InterruptedException {
		driver.findElement(exp_Child_checkBox).click();
		Thread.sleep(2000);
	}
	
	public void setExpectedChildDate() throws InterruptedException {
		driver.findElement(profileDateBtn).click();
		Thread.sleep(2000);
		driver.findElement(profieDate).click();
		Thread.sleep(1000);	
	}
	
	public void clickOnProfileSave() throws InterruptedException {
		driver.findElement(profileSave).click();
		Thread.sleep(3000);

	}

	// My Contact
	By myContact = By.id("edittz");
	By contactMobile = By.id("txtAddMobilenew");
	By contactVerifyBtn = By.id("callmebtn");
	By contactMobileOtp = By.id("mobotp");
	By contactEmailOtp = By.id("emailotp");
	By contatSubmit = By.id("otpsubmit");
	By contactOverlay = By.xpath("//div[@class='otp-popup-overlay']");
	By verifyBtn = By.id("callmebtn");

	public void clickOnMyContact() throws InterruptedException {
		driver.findElement(myContact).click();
		Thread.sleep(1000);
	}

	public void setContactNumber() throws InterruptedException {
		WebElement updatedNumber = driver.findElement(contactMobile);
		updatedNumber.clear();
		Thread.sleep(200);
		updatedNumber.sendKeys("8523698569");
		Thread.sleep(2000);
	}

//	public void setMobileOtp() {
//		driver.findElement(contactMobileOtp).sendKeys("OTP");
//	}
//	public void setEmailOtp() {
//		driver.findElement(contactEmailOtp).sendKeys("OTP");
//	}
//	public void clickOnOtpSubmit() {
//		driver.findElement(contatSubmit).click();
//	}

	public void clickOnContactVerifyBtn() {
		driver.findElement(verifyBtn).click();
	}



	

}
