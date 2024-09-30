package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_MyProfile {

	WebDriver driver;
	MyProfilePage profile;
	LoginPage login;

	
	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
	}

	@Given("user open the FirstCry website")
	public void user_open_the_FirstCry_website() {
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
	}

	@When("The user clicks on loginBtn")
	public void the_user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@And("The user enters his mobile number")
	public void the_user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();

	}

	@And("click on continue btn")
	public void click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@And("click on submit btn")
	public void click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();

	}

	@When("click On MyAccount link")
	public void click_On_MyAccount_link() throws InterruptedException {
		profile.clickOnMyAccount();
	}

	@Then("The user is able click on MyAccount")
	public void the_user_is_able_click_on_MyAccount() {
		Assert.assertTrue(driver.getCurrentUrl().contains("cashcoupons"));
		driver.close();
	}
///////////////////////////////////////////////////////////////////////////////

	@Given("user Open the FirstCry website")
	public void user_open_the_firstcry_website() {
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
	}

	@When("user clicks on loginBtn")
	public void user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@When("user enters his mobile number")
	public void user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();

	}

	@When("user click on continue btn")
	public void user_click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();
	}

	@When("user click On MyAccount link")
	public void user_click_on_myaccount_link() throws InterruptedException {
		profile.clickOnMyAccount();

	}

	@When("user click on MyProfile")
	public void user_click_on_myprofile() throws InterruptedException {
		profile.clickOnMyProfile();
	}

	@Then("The user is able click on MyProfile")
	public void the_user_is_able_click_on_myprofile() {
		Assert.assertTrue(driver.getCurrentUrl().contains("accountdetails"));
		driver.close();
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	@Given("user Open the FirstCry website link")
    public void user_open_the_firstcry_website_link() {
        driver.get("https://www.firstcry.com");
        driver.manage().window().maximize();
    }

    @When("user clicks on loginbtn")
    public void user_clicks_on_loginbtn() throws InterruptedException {
    	login.clickOnLoginButton();
        
    }

    @When("user enters his mobile Number")
    public void user_enters_his_mobile_Number() throws InterruptedException {
    	login.sendMobileNumber();
    }

    @When("user click on continue Btn")
    public void user_click_on_continue_Btn() throws InterruptedException {
    	login.clickOnContinueButton();
    }

    @When("user click on submit Btn")
    public void user_click_on_submit_Btn() throws InterruptedException {
    	login.clickOnSubmitButton();
    }

    @When("user click On myAccount link")
    public void user_click_on_myAccount_link() throws InterruptedException {
    	profile.clickOnMyAccount();
    }

    @When("user click on myProfile")
    public void user_click_on_myProfile() throws InterruptedException {
    	profile.clickOnMyProfile();
    }

    @When("user click on edit icon of My Profile")
    public void user_click_on_edit_icon_of_my_profile() throws InterruptedException {
    	profile.clickOnProfileEditIcon();
    }

    @When("^user enters the name (.*)$")
    public void user_enters_the_name(String name) throws InterruptedException {
    	profile.enterName(name);
    }

    @When("user clicks on radio button")
    public void user_clicks_on_radio_button() throws InterruptedException {
    	profile.clickOnProfileIAm();
    }

    @When("user clicks on I am expecting another child checkbox")
    public void user_clicks_on_i_am_expecting_another_child_checkbox() throws InterruptedException {
    	profile.clickOnExpectingChildCheckBox();
    }

    @When("user selects a due date")
    public void user_selects_a_due_date() throws InterruptedException {
    	profile.setExpectedChildDate();
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {
    	profile.clickOnProfileSave();
    }

    @Then("Users profile should be updated")
    public void users_profile_should_be_updated() {
    	String text = driver.findElement(By.xpath("//*[text()='Expecting Father']")).getText();
        Assert.assertEquals("Expecting Father",text);
    }
}

//
//	@Given("user is already logged in")
//	public void user_is_already_logged_in() {
//
//	}
//
//	@And("click on MyProfile link")
//	public void click_on_my_profile_link() {
//
//	}
//
//	@Then("The user is able click on MyProfile")
//	public void the_user_is_able_click_on_my_profile() {
//
//	}
//
//	@Given("user is on the MyProfile section")
//	public void user_is_on_the_my_profile_section() {
//
//	}
//
//	@And("click on edit icon of My Profile")
//	public void click_on_edit_icon_of_my_profile() {
//
//	}
//
//	@And("enter the Amar")
//	public void enter_the_amar() {
//
//	}
//
//	@And("click on A Dad radio button")
//	public void click_on_a_dad_radio_button() {
//
//	}
//
//	@And("click on I am expecting another child checkbox")
//	public void click_on_i_am_expecting_another_child_checkbox() {
//
//	}
//
//	@And("select a <due date>")
//	public void select_a_due_date() {
//
//	}
//
//	@When("click on save button")
//	public void click_on_save_button() {
//
//	}
//
//	@Then("Users profile should be updated")
//	public void users_profile_should_be_updated() {
//
//	}
//
//	@Given("user is on the MyProfile section")
//	private void user_is_on_the_MyProfile_section() {
//
//	}
//
//	@And("click on edit icon of My Profile")
//	private void click_on_edit_icon_of_My_Profile() {
//
//	}
//
//	@Given("do not enter any name")
//	public void do_not_enter_any_name() {
//
//	}
//
//	@And("do not click on I am expecting another child checkbox")
//	public void do_not_click_on_i_am_expecting_another_child_checkbox() {
//
//	}
//
//	@And("do not set a due date")
//	public void do_not_set_a_due_date() {
//
//	}
//
//	@When("click on save btn")
//	public void click_on_save_btn() {
//
//	}
//
//	@Then("Users profile should not be updated")
//	public void users_profile_should_not_be_updated() {
//
//	}
//
//	@Given("user is on the MyProfile section")
//	private void user_is_on_the_MyProfile_section2() {
//
//	}
//
//	@Given("click on edit icon of My Contact")
//	public void click_on_edit_icon_of_my_contact() {
//
//	}
//
//	@And("update the <mobile number>")
//	public void update_the_mobile_number2() {
//
//	}
//
//	@And("provide otp sended on mobile")
//	public void provide_otp_sended_on_mobile() {
//
//	}
//
//	@And("provide otp sended on registered email")
//	public void provide_otp_sended_on_registered_email() {
//
//	}
//
//	@When("click on VerifySave button")
//	public void click_on_verify_save_button() {
//
//	}
//
//	@Then("users mobile number should updated")
//	public void users_mobile_number_should_updated() {
//
//	}
//
//	@Given("user is on the MyProfie section")
//	private void user_is_on_the_MyProfie_section() {
//
//	}
//
//	@And("click on edit icon of My Contact")
//	private void click_on_edit_icon_of_My_Contact() {
//
//	}
//
//	@And("update the mobile number")
//	public void update_the_mobile_number() {
//
//	}
//
//	@And("users mobile number should not updated")
//	public void users_mobile_number_should_not_updated() {
//
//	}
//
//	@When("user is on the MyProfie section")
//	public void user_is_on_the_my_profie_section() {
//
//	}
//
//	@And("do not provide otp and will not give you an otp after entering your number {int} times")
//	public void do_not_provide_otp_and_will_not_give_you_an_otp_after_entering_your_number_times(Integer int1) {
//
//	}
//	
//	@When ("click on VerifySave button")
//	public void click_on_VerifySave_button(){
//		
//	}
//
//	@Given("user is on the MyProfie section")
//	private void user_is_on_the_MyProfie_section1() {
//
//	}
//
//	@Given("click on child details")
//	public void click_on_child_details() {
//
//	}
//
//	@And("enter <child name>")
//	public void enter_child_name() {
//
//	}
//
//	@And("enter <date of birth>")
//	public void enter_date_of_birth() {
//
//	}
//
//	@And("select a gender")
//	public void select_a_gender() {
//
//	}
//
//	@And("enter <weight>")
//	public void enter_weight() {
//
//	}
//
//	@And("enter <height>")
//	public void enter_height() {
//
//	}
//
//	@When("click on save button")
//	public void click_on_save_button1() {
//
//	}
//
//	@Then("child details successfully saved")
//	public void child_details_successfully_saved() {
//		
//	}
//	
//	
//	
//	@Given("user is on the MyProfile section")
//    public void user_is_on_the_my_profile_section1() {
//       
//    }
//
//    @Given("click on child details")
//    public void click_on_child_details2() {
//       
//    }
//
//    @And("do not enter child name")
//    public void do_not_enter_child_name() {
//        
//    }
//
//    @And("do not enter date of birth")
//    public void do_not_enter_date_of_birth() {
//        
//    }
//
//    @And("select a gender")
//    public void select_a_gender2() {
//        
//    }
//
//    @And("do not enter weight")
//    public void do_not_enter_weight() {
//       
//    }
//
//    @And("do not enter height")
//    public void do_not_enter_height() {
//        
//    }
//
//    @When("click on save button")
//    public void click_on_save_button2() {
//        
//    }
//
//    @Then("child details should not saved")
//    public void child_details_should_not_saved() {
//        
//    }
//
//    @And("click on My Address Book")
//    public void click_on_my_address_book() {
//        
//    }
//
//    @And("enter {string}")
//    public void enter_name() {
//     
//    }
//
//    @And("enter house number")
//    public void enter_house_number() {
//       
//    }
//
//    @And("enter street address")
//    public void enter_street_address() {
//        
//    }
//
//    @And("enter landmark")
//    public void enter_landmark() {
//        
//    }
//
//    @And("enter pincode")
//    public void enter_pincode() {
//        
//    }
//
//    @And("enter mobile number")
//    public void enter_mobile_number() {
//        
//    }
//
//    @And("enter telephone number")
//    public void enter_telephone_number() {
//        
//    }
//    @When ("click on save button")
//    private void click_on_save_button3() {
//		
//	}
//
//    @Then("users address details successfully saved")
//    public void users_address_details_successfully_saved() {
//        
//    }
//    
//    
//    
//    
//    @Given ("user is on the MyProfie section")
//    private void user_is_on_the_MyProfie_section2() {
//		
//
//	}
//    @And("click on My Address Book")
//    public void click_on_my_address_book2() {
//        
//    }
//
//    @And("do not enter name")
//    public void do_not_enter_name() {
//        
//    }
//
//    @And("do not enter house number")
//    public void do_not_enter_house_number() {
//        
//    }
//
//    @And("do not enter street address")
//    public void do_not_enter_street_address() {
//        
//    }
//
//    @And("do not enter landmark")
//    public void do_not_enter_landmark() {
//        
//    }
//
//    @And("do not enter pincode")
//    public void do_not_enter_pincode() {
//        
//    }
//
//    @And("do not enter mobile number")
//    public void do_not_enter_mobile_number() {
//        
//    }
//
//    @And("do not enter telephone number")
//    public void do_not_enter_telephone_number() {
//       
//    }
//    @When ("click on save button")
//    private void click_on_save_button4() {
//		
//	}
//
//    @Then("users address details should not saved")
//    public void users_address_details_should_not_saved() {
//        
//    }
//	
//	
//	
//
//}
