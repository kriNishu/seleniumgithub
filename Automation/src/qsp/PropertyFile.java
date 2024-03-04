package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PropertyFile{
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.name("pwd")).sendKeys(password);
		

	} 
}
	


