package com.orangehrm.mainmenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {
	WebDriver driver;
	By admin = By.id("menu_admin_viewAdminModule");
	By pim = By.id("menu_pim_viewPimModule");
	By time = By.id("menu_time_viewTimeModule");
	By recruitment = By.id("menu_recruitment_viewRecruitmentModule");
	By myinfo = By.id("menu_pim_viewMyDetails");
	By performance = By.id("menu__Performance");
	By dashboard = By.id("menu_dashboard_index");
	By directory = By.id("menu_directory_viewDirectory");
	By maintenance = By.id("menu_maintenance_purgeEmployee");
	By buzz = By.id("menu_buzz_viewBuzz");
	
	public  MainMenu(WebDriver driver) {
		this.driver=driver;		
	}
	
	public WebElement findAdminmenu() {
		return driver.findElement(admin);
	}
	public WebElement findPIM() {
		return driver.findElement(pim);
	}
	public WebElement findTime() {
		return driver.findElement(time);
	}
	public WebElement findRecruitment() {
		return driver.findElement(recruitment);	
	}
	public WebElement findMyInfo() {
		return driver.findElement(myinfo);
	}
	public WebElement findPerformance() {
		return driver.findElement(performance);
	}
	public WebElement findDashBoard() {
		return driver.findElement(dashboard);
	}
	public WebElement findDirectory() {
		return driver.findElement(directory);
	}
	public WebElement findmaintenance() {
		return driver.findElement(maintenance);
	}
	public WebElement findBuzz() {
		return driver.findElement(buzz);
	}
	
	
	

}
