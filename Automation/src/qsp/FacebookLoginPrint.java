package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPrint {

	public static void main(String[] args) {
WebDriver d =new ChromeDriver();
d.get("https://www.facebook.com/");
String text=d.findElement(By.name("login")).getAttribute("id");
String text1=d.findElement(By.name("login")).getTagName();

System.out.println(text);
System.out.println(text1);
d.quit();

	}

}
