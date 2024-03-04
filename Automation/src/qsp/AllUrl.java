package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllUrl {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/search?q=wipro+jobs");
	List<WebElement> allLinks = d.findElements(By.xpath("//a"));
	int count=allLinks.size();
	System.out.println(count);
	for(WebElement w:allLinks) {
		String url = w.getAttribute("href");
		System.out.println(url);
	}
	
	
	
	
}
}

	
