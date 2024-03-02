package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPageClass {
	@FindBy(xpath="//div[text()='Add New']") ///decleration
	private WebElement addNewBtn;
	
	@FindBy(xpath= "//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(id= "customerLightBox_nameField")
	private WebElement customerNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescTbx;
	
	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement CustomerDD;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompanyTxt;
	
	@FindBy(xpath= "//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='navigationLinks']/../div[2]")
	private WebElement actualCustTxt;
	
	public TaskListPageClass(WebDriver driver) ///inilization
	{
		PageFactory.initElements(driver, this);
	}
///getters methods
	public WebElement getAddNewBtn() {        ///utilization
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescTbx() {
		return customerDescTbx;
	}

	public WebElement getCustomerDD() {
		return CustomerDD;
	}

	public WebElement getOurCompanyTxt() {
		return ourCompanyTxt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	public WebElement getActualCustTxt() {
		return actualCustTxt;
	}

	 
	

}
