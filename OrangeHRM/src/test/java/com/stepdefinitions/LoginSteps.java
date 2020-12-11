package com.stepdefinitions;

import com.baseclasses.Library;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library {
	@Given("To launch the Application on the browser")
	public void to_launch_the_Application_on_the_browser() {
		browserSetUp();
	    logger.info("Browser has been launched");}

	@When("Enter username and password and click on loginbutton")
	public void enter_username_and_password_and_click_on_loginbutton() {
		LoginPage lpage=new LoginPage(driver);
		lpage.login(properties.getProperty("user"), properties.getProperty("pass"));
	
	    	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	   }


	
	


}
