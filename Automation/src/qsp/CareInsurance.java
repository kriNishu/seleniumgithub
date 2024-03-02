package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@name='dob']")).click();
		Thread.sleep(2000);
		WebElement month = d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Thread.sleep(4000);

		Select s=new Select(month);
		s.selectByIndex(8);
		WebElement year = d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Thread.sleep(2000);
		Select s1=new Select(year);
		s1.selectByVisibleText("1996");
		d.findElement(By.xpath("//a[.='10']")).click();
		d.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9845098450");
		d.findElement(By.id("renew_policy_submit")).click();
		
	}

}
