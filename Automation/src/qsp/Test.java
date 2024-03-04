package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		for(WebElement w:allLinks) {
		 String data = w.getText();
		 System.out.println(data);
		}
		
	}

}
