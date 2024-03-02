package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver d;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser",true);
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().window().maximize();
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
		d.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		LoginPage l=new LoginPage(d);
		d.get(url);
		l.setLogin(un, pw);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrack e =new EnterTimeTrack(d);
		e.setLogout();
	}
	
	

}
