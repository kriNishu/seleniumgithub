package qsp;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	Thread.sleep(3000);
	
 d.findElement(By.xpath("(//a[@class='block-link__overlay-link'])[10]")).click();
	
}
}
