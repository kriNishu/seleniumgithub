package com.actitime.testscript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCampain1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.112.128:8080");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("New Campaign")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("property(Campaign Name)")).sendKeys("NoiseWatch");
		Thread.sleep(1000); 
		driver.findElement(By.name("property(Start Date)")).sendKeys("03/01/2024");
		Thread.sleep(1000);
		driver.findElement(By.name("property(Expected Revenue)")).sendKeys("20000");
		Thread.sleep(1000);
		driver.findElement(By.name("property(Actual Cost)")).sendKeys("10000");
		Thread.sleep(1000);
		driver.findElement(By.name("property(Num sent)")).sendKeys("5");
		Thread.sleep(1000); 
		driver.findElement(By.name("property(Budgeted Cost)")).sendKeys("3000");
		Thread.sleep(1000); 
		driver.findElement(By.name("property(Expected Response)")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.name("property(End Date)")).sendKeys("03/30/2024");
		Thread.sleep(1000);
		driver.findElement(By.name("property(Description)")).sendKeys("planning for noice sale");
		Thread.sleep(1000);
		driver.findElement(By.name("property(Type)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Advertisement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("property(Status)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Planning']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		Thread.sleep(4000);
			
		String expText = "NoiseWatch";
		
		String actText = driver.findElement(By.id("mouseArea__Campaign Name")).getText();
		
		boolean res = expText.equalsIgnoreCase(actText);
		if(res)
		{
			System.out.println("Campain Created and PASS");
		}
		else
		{
			System.out.println("Campain Not Created and FAIL");
		}
	driver.quit();
	}

}
