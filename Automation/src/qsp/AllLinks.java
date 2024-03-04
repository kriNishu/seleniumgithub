package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		Thread.sleep(2000);

		int count =allLinks.size();
		System.out.println(count);
		for(WebElement o:allLinks) {
			String text=o.getText();
			System.out.println(text);
		}
		d.quit();
		
		
	}

}
