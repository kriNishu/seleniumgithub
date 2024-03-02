package comactitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		EnterTimeTrack e=new EnterTimeTrack(d);
		e.getTasksBtn().click();
		TaskList t=new TaskList(d);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer", 1, 2);
		String custDesc = f.getExcelData("CreateCustomer", 1, 3);
		t.getCustNameTxtbx().sendKeys(custName);
		t.getCustDesctxt().sendKeys(custDesc);
		t.getSelCustDd().click();
		t.getOurCompanyOption().click();
		t.getCreateCustBtn().click();
		String cName = t.getCustomerName().getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(custName, cName);
		Thread.sleep(3000);
		t.getCrNewCustCloseBtn().click();
		s.assertAll();
		
	}

}
