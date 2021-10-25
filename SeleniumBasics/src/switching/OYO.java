package switching;

import java.util.concurrent.TimeUnit;
import utilities.SeleniumUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class OYO {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	 {
		SeleniumUtils util=new SeleniumUtils();
	  // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  // WebDriver driver = new ChromeDriver();
	   util.setUp("https://www.oyorooms.com/");
	   driver=util.driver;
		Thread.sleep(5000);
	  // driver.manage().timeouts.implicitlywait(30, TimeUnit.SECONDS);
	   WebElement SrcClear = driver.findElement(By.id("autoComplete__home"));
	   SrcClear.clear();
	   SrcClear.sendKeys("Solapur");
	   
	   WebElement FirstDate = driver.findElement(By.xpath("//div[@class="oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home"]/div/span[1]"));
			   // FirstDate.clear();
			    FirstDate.click();
	  }
}
