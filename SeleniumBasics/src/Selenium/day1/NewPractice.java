package Selenium.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice {

	public static void main(String[] args)  throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 
		//ChromeDriver nd = new ChromeDriver();
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://demosite.executeautomation.com/Login.html");
		cdriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		WebElement inputField = cdriver.findElement(By.name("UserName"));
		inputField.sendKeys("admin");
		
		WebElement inputPass=cdriver.findElement(By.name("Password"));
		inputPass.sendKeys("manager");
		
		WebElement logB=cdriver.findElement(By.cssSelector("input[name='Login']"));
		logB.click();
		
		//WebElement UserForm = ns.findElement(By.cssSelector("a[href='index.html']"));
		//UserForm.click();
		Thread.sleep(3000);
		WebElement LogOut = cdriver.findElement(By.cssSelector("a[href='Login.html']"));
		LogOut.click();
		
	
		
		

	}

}



