package Selenium.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//enter required application url
		driver.get("https://www.gsmarena.com/");
	
		
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		
		//to identify multiple web elements
		List<WebElement> mobList=driver.findElements(By.xpath("//div[@class='makers']/ul/li/a/strong/span"));
		//get the count of identify element
		int mobileCount=mobList.size();
		System.out.println(mobileCount);
		//to access one by one list element
		for(int i=0;i<mobileCount;i++) {
			
			System.out.println(mobList.get(i).getText());
			
		}
		//close current browser
		//driver.close();		
	}
}