package com.actitime.testscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibClass;
import com.actitime.pom.HomePageClass;
import com.actitime.pom.TaskListPageClass;

@Listeners(com.actitime.generic.ListenerImplimentationClass.class)
public class CustomerModule  extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException // test method name shld be same name as testcase name
, InterruptedException
	{  //                                 with one prefix test.
		FileLibClass f= new FileLibClass();
		String exceptedCustName = f.getExcelData("CreateCustomer", 1, 2);
		String custDesp= f.getExcelData("CreateCustomer", 1, 3);
		
		HomePageClass h= new HomePageClass(driver);
		h.setTaskTab();
		
		TaskListPageClass t= new TaskListPageClass(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getCustomerNameTbx().sendKeys(exceptedCustName);
		t.getCustomerDescTbx().sendKeys(custDesp);Thread.sleep(2000);
		t.getCustomerDD().click();Thread.sleep(2000);
		t.getOurCompanyTxt().click();Thread.sleep(2000);
		t.getCreateCustomerBtn().click();
		Thread.sleep(4000);
		String actualTxt = t.getActualCustTxt().getText();
		Assert.assertEquals(actualTxt, exceptedCustName);
	
		
	}


}
