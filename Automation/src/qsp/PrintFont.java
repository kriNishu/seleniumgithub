package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFont {

	public static void main(String[] args) {
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
String font=d.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
String fontType=d.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");

System.out.println(font);
System.out.println(fontType);

	}

}
