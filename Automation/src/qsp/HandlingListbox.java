package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://m.facebook.com/");
		Thread.sleep(4000);
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		WebElement monthListbox = d.findElement(By.id("month"));
		Select s=new Select(monthListbox);
		s.selectByIndex(8);
		Thread.sleep(2000);
		s.selectByValue("11");
		Thread.sleep(2000);
		s.selectByVisibleText("Apr");
		Thread.sleep(2000);
		d.quit();
		
	}

}
