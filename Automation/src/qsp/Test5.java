package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("window.scrollTo(0,3000)");
	
	
			
}
}
