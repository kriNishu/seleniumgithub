package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.cleartrip.com/flights");
	d.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("bangalore");
	d.findElement(By.xpath("(//div[.='BLR'])[2]")).click();
	d.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("goa");
	d.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
	d.findElement(By.xpath("//div[contains(text(),'Sun, Feb 4']"));
	d.findElement(By.xpath("//span[.='Search flights']")).click();
	
	
}
}
