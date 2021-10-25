     package Selenium.day1;
     import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
     
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
	 public class Demosite
	 {

	 public static void main(String[] args) throws InterruptedException
	 {
	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	   WebDriver cdriver = new ChromeDriver();
	   cdriver.manage().window().maximize();
	   cdriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	   cdriver.get("https://demosite.executeautomation.com/Login.html");
	  
	   WebElement userNameInputField = cdriver.findElement(By.name("UserName"));
       userNameInputField.sendKeys("execution");
       WebElement passwordInputField = cdriver.findElement(By.name("Password"));
       passwordInputField.sendKeys("admin");
       WebElement loginButton = cdriver.findElement("input[name='Login']");
       loginButton.click();
       
     /*  WebElement Menu = cdriver.findElement(By.id("welcome"));
       Menu.click();
      // WebElement.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/index.php/auth/logout")).click();
      // WebElement logoutLink = cdriver.findElement(By.cssSelector("input[name='Logout']"));
       //logoutLink.click();
       //WebElement Direct = cdriver.findElement(By.id("menu_directory_viewDirectory"));// Directory Tab
       //Direct.click();
       Thread.sleep(6000);
	   WebElement out = cdriver.findElement(By.linkText("Logout"));
	   out.click(); */
	  }
  }	  
	 