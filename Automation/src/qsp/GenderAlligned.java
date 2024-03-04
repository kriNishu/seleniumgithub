package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderAlligned {

	public static void main(String[] args) throws InterruptedException {
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
d.findElement(By.xpath("//a[@rel='async']")).click();
Thread.sleep(2000);
int y1=d.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
int y2=d.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
int y3=d.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
System.out.println(y1);
System.out.println(y2);
System.out.println(y3);
if(y1==y2&&y2==y3) {
	System.out.println("gender radio button are alligned");
}
else {
	System.out.println("gender radio button are not alligned");
}
d.quit();

	}

}
