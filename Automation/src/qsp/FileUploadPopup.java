package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
	 d.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//section[.='File Uploads']")).click();
		Thread.sleep(3000);
		File f =new File("../data/file.pdf");
		String abspath = f.getAbsolutePath();
		d.findElement(By.xpath("//input[@id='fileInput']")).sendKeys(abspath);
		
	}

}
