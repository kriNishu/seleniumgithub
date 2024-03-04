package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(id="logoutLink")
private WebElement lgout;

@FindBy(xpath="//a[@class='content tasks']")
private WebElement tasksBtn;
public EnterTimeTrack(WebDriver d) {
	PageFactory.initElements(d, this);
}
public void setLogout() {
	lgout.click();
}



public WebElement getTasksBtn() {
	return tasksBtn;
}

}
