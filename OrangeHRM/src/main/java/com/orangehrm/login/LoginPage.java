package com.orangehrm.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginbutton = By.id("btnLogin");
	
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		}
	public void login(String uname, String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbutton).click();
		
	}

}
