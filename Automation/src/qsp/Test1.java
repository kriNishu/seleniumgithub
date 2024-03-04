package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
	Thread.sleep(3000);
	List<WebElement> allSugg = d.findElements(By.xpath("//span[contains(text(),'java')]"));
	for(WebElement w:allSugg) {
		String data = w.getText();
		System.out.println(data);
	}
	
	
}
}
