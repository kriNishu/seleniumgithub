package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException   {
WebDriver d = new ChromeDriver();

d.get("https://www.amazon.in/");
Thread.sleep(3000);
d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 pro max");
Thread.sleep(3000);
d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
Thread.sleep(3000);
d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
Thread.sleep(8000);
d.findElement(By.xpath("(//input[@title='Add to Shopping Cart'])[2]")).click();

 



























	
	}

	

}
