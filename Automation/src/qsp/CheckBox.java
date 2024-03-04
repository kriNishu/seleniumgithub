package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://online.actitime.com/login/login.do");
boolean b = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
if(b==true) {
	System.out.println("check box is selected");
}
else {
	System.out.println("check box is not selected");
}
driver.close();
	}

}
