package com.pages.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressBookPage {

	WebDriver driver;

	public MyAddressBookPage(WebDriver driver) {
		this.driver = driver;
	}


	By myAddressBook = By.xpath("//*[text()='My Address Book']");
	By userName = By.id("txtAddName");
	By houseNo = By.id("txtAddAddress1");
	By address = By.id("txtAddAddress2");
	By landmark = By.id("txtAddAddress3");
	By pinCode = By.id("txtAddPincode");
	By mobile = By.id("txtAddMobile");
	By telReg = By.id("txtregion");
	By telNum = By.id("txtlandline");
	By addressSaveBtn = By.id("btnSaveAddress");

	public void clickOnMyAddressBook() throws InterruptedException {
		driver.findElement(myAddressBook).click();
		Thread.sleep(1000);
	}

	public void setUserNameinAddress() throws InterruptedException {
		driver.findElement(userName).sendKeys("Prem Chopra");
		Thread.sleep(1000);
	}

	public void setHouseNumber() throws InterruptedException {
		driver.findElement(houseNo).sendKeys("PK458 ,Kharadi , Pune ");
		Thread.sleep(1000);
	}

	public void setAddress() throws InterruptedException {
		driver.findElement(address).sendKeys("Kharadi , Pune");
		Thread.sleep(1000);
	}

	public void setLandMark() throws InterruptedException {
		driver.findElement(landmark).sendKeys("Near Reliance Smart Mall");
		Thread.sleep(1000);
	}

	public void setPinCode() throws InterruptedException {
		driver.findElement(pinCode).sendKeys("411014");
		Thread.sleep(4000);
	}

	public void setMobileNumber() throws InterruptedException {
		driver.findElement(mobile).sendKeys("8917455859");
		Thread.sleep(1000);
	}

	public void setTelephoneRegion() throws InterruptedException {
		driver.findElement(telReg).sendKeys("11");
		Thread.sleep(100);
	}

	public void setTelNumber() throws InterruptedException {
		driver.findElement(telNum).sendKeys("89172556");
		Thread.sleep(1000);
	}

	public void clickOnAddressSaveBtn() {
		driver.findElement(addressSaveBtn).click();
	}

}
