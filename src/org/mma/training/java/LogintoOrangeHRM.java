package org.mma.training.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoOrangeHRM {
	
	static WebDriver driver;
	public static void main(String[] args) {
	
		launchingWebsite();
		validLogin();
		closeBrowser();
			
	}
	
	public static void launchingWebsite() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	public static void validLogin() {
		
		driver.findElement(By.xpath("//input[@id ='txtUsername' ]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword' ]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[ @id='welcome']")).click();
		driver.findElement(By.xpath("//a[ text()='Logout']")).click();
	}
	
	public static void closeBrowser() {
		
		
		driver.quit();
	}
}
