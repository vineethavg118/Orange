package com.reusablefunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.Library;

public class SeleniumUtilities extends Library {
	WebDriver driver;
	public SeleniumUtilities(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void getTitle() {

		System.out.println(driver.getTitle());

	}
	public void explicitlyWait(String locator) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));

	}

	public void movetoElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}
		
    public void selDrop(WebElement element, String value) {
    Select dropdown=new Select(element);
    dropdown.selectByVisibleText(value);
  }
    
    public void datePicker(String locator) {
    WebElement selectDate=driver.findElement(By.xpath(locator));
    selectDate.click();
    	
    }
    
	public void quit() {
		driver.close();

	}
	

}
