package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
WebDriver d = new ChromeDriver();
d.get("https://online.actitime.com/login/login.do");
Thread.sleep(3000);
 d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
 Thread.sleep(3000);

 d.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
 Thread.sleep(3000);
 d.findElement(By.xpath("//div[.='Login ']")).click();
 Thread.sleep(3000);

 d.close();

	}

}
