package test.check;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Check 
{
	private WebDriver driver;
	private String google;
	@BeforeSuite
	public void initialize()
	{
		driver=new FirefoxDriver();
		google="https://www.google.co.in/";
	}
	@Test
	public void display() throws InterruptedException
	{
		driver.get(google);
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 	
		js.executeScript("alert('Hi, Welcome to google');");
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
