package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePageClass;
import com.actitime.pom.LoginPage;
// 4 Configurations methods
public class BaseClass {

	public  WebDriver driver;
@Parameters("browser")
	@BeforeTest 
	public void openBrowser(String browser)   // code for opening browser
	{
		Reporter.log("open browser", true);
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

	}

	@AfterTest
	public void closeBrowser()  //code for closing browser
	{
		Reporter.log("close browser", true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException        //code for login to app
	{
		Reporter.log("login", true);
		FileLibClass f= new FileLibClass();
		
		String url = f.getPropertyData("url");
		String	un=  f.getPropertyData("username");
		String	pw= f.getPropertyData("password");

		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);


	}
	@AfterMethod
	public void logout()      //code for logout from app
	{
		Reporter.log("logout", true);

		HomePageClass h= new HomePageClass(driver);
		h.setLogout();
	}


}
