package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		Thread.sleep(2000);
		List<WebElement> allSugg = d.findElements(By.xpath("//div[contains(text(),'iphone 15 pro max')]"));
		int count=allSugg.size();
		System.out.println(count);
		for(WebElement w:allSugg) {
			String text = w.getText();
			System.out.println(text);
		}
		allSugg.get(3).click();
		
		
		
	}

}
