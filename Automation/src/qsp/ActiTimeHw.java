package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeHw {

	public static void main(String[] args) {
WebDriver d = new ChromeDriver();
d.get("https://online.actitime.com/login/login.do");
WebElement username = d.findElement(By.name("username"));
int h1=username.getSize().getHeight();
int w1=username.getSize().getWidth();
WebElement password = d.findElement(By.xpath("//input[@type='password']"));
int h2=password.getSize().getHeight();
int w2=password.getSize().getWidth();
if(h1==h2&&w1==w2) {
	System.out.println("Test is pass");
}
else {
	System.out.println("Test is fail");

}
d.quit();

}
}
