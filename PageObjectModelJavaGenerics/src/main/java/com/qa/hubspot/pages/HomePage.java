package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	//By header = By.className("private-page__title");
	By header = By.xpath("//header//h1");
	
	//page actions:
	public String getHomePageTitle(){
		return driver.getTitle();
	//driver.findElement(By.xpath("//header//h1")).getAttribute("class"));
		
		
	}
	
	public String getHomePageHeader(){
		return doGetText(header);
	}
	
	
	

}
