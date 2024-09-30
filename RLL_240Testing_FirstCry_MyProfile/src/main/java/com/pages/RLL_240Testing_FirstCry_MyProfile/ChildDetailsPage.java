package com.pages.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildDetailsPage {
	
	WebDriver driver;

	public ChildDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Child Details
	By childDetails = By.xpath("(//*[text()='Child Details'])[1]");
	By childname = By.id("childFnLName");
	By childDate = By.id("EditChildDOB");
	By childPreviousArrowOfDateButton = By.xpath("//*[@class='prev-arrow']");
	By childDate19July = By.xpath("//div[text()='12']");
	By childGender = By.id("childGenderBoy");
	By childWeight = By.id("weight");
	By childHeight = By.id("height");
	By childSaveBtn = By.id("saveChild");

	public void clickOnChildDetails() throws InterruptedException {
		driver.findElement(childDetails).click();
		Thread.sleep(1000);
	}
	
	public void setChildName(String childName) throws InterruptedException {
		driver.findElement(childname).sendKeys(childName);
		Thread.sleep(1000);
	}

	public void selectChildDate() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='sprite-ac sp_cal'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[text()='4'])[1]")).click();
		Thread.sleep(1000);
	}

	public void clickOnChildGender() throws InterruptedException {
		driver.findElement(childGender).click();
		Thread.sleep(1000);
	}

	public void setChildWeight(String weight) throws InterruptedException {
		driver.findElement(childWeight).sendKeys(weight);
		Thread.sleep(500);
	}

	public void setChildHeight(String height) throws InterruptedException {
		driver.findElement(childHeight).sendKeys(height);
		Thread.sleep(500);
	}

	public void clickOnChildSaveBtn() throws InterruptedException {
		driver.findElement(childSaveBtn).click();
		Thread.sleep(200);

	}

}
