package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTxtbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDesctxt;
@FindBy(xpath="//button[@class='x-btn-text']")
private WebElement selCustDd;
@FindBy(xpath="//a[contains(text(),'Our Company')]")
private WebElement ourCompanyOption;
@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createCustBtn;
@FindBy(xpath="//a[.='All Customers']/../../div[2]")
private WebElement customerName;
@FindBy(id="customerLightBoxCloseButton")
private WebElement crNewCustCloseBtn;
public TaskList(WebDriver d) {
	PageFactory.initElements(d, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustBtn() {
	return newCustBtn;
}
public WebElement getCustNameTxtbx() {
	return custNameTxtbx;
}
public WebElement getCustDesctxt() {
	return custDesctxt;
}
public WebElement getSelCustDd() {
	return selCustDd;
}
public WebElement getOurCompanyOption() {
	return ourCompanyOption;
}
public WebElement getCreateCustBtn() {
	return createCustBtn;
}
public WebElement getCustomerName() {
	return customerName;
}
public WebElement getCrNewCustCloseBtn() {
	return crNewCustCloseBtn;
}
	
}


