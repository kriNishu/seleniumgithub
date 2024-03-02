package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {
	public static void main(String[] args) {
		
	
ChromeOptions ch=new ChromeOptions();
ch.addArguments("--disable-notifications");
WebDriver d=new ChromeDriver(ch);
d.get("https://www.google.com/");

	}
}
