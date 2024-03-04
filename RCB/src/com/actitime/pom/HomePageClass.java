package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {     //// logout button is present in home page so we are writing in home page class
	 // declaration
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskTab;

	public HomePageClass(WebDriver driver) // inilization
	{
		PageFactory.initElements(driver, this);
	}
	
	// perpose is wh anyone want to logot simply call this method
	
	public void setLogout()  // utilization
	{
		lgOut.click();
	}
	public void setTaskTab()
	{
		taskTab.click();
	}
}
