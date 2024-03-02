package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://secure.indeed.com/");
	d.findElement(By.id("login-google-button")).click();
	d.findElement(By.id("apple-signin-button")).click();
	Set<String> allwind = d.getWindowHandles();
	for(String s:allwind) {
		d.switchTo().window(s);
		d.close();
	}
	
}
}
