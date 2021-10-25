package Selenium.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
     ChromeDriver cdriver = new ChromeDriver();
     //cdriver.get("https://www.google.com");
   // System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//FirefoxDriver fdriver = new FirefoxDriver();
	//fdriver.get("https://www.google.com");
     cdriver.get("https://demo.actitime.com/login.do");
     
     WebElement userNameInputField = cdriver.findElement(By.id("username"));
     userNameInputField.sendKeys("admin");
     WebElement passwordInputField = cdriver.findElement(By.name("pwd"));
     passwordInputField.sendKeys("manager");
     WebElement loginButton = cdriver.findElement(By.id("loginButton"));
     loginButton.click();
    // cdriver.close();
	}

}
