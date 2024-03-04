package comactitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCrm {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("http://192.168.86.128:8080/");
	d.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	d.findElement(By.id("passWord")).sendKeys("123456");
	d.findElement(By.xpath("//input[@alt='Sign In']"));
	
	
}
}
