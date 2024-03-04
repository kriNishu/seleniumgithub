package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
ChromeDriver d = new ChromeDriver();
d.get("https://www.facebook.com");
String title = d.getTitle();
System.out.println(title);
d.close();
	}
}
