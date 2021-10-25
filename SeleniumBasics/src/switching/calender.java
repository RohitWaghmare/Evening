package switching;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class calender {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();
		//driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		util.setUp("https://www.redbus.in/");
		driver=util.driver;
		Thread.sleep(5000);
		WebElement srclear = driver.findElement(By.xpath("//div/input[@id='src']"));
		srclear.clear();
		srclear.sendKeys("Solapur");
		Thread.sleep(3000);
		WebElement sugestcity= driver.findElement(By.xpath("//ul/li[@select-id='results[0]']"));
		sugestcity.click();
		
		WebElement destclear = driver.findElement(By.xpath("//div/input[@id='dest']"));
		destclear.clear();
		destclear.sendKeys("Pune");
		WebElement destcity= driver.findElement(By.xpath("//ul/li[@select-id='results[0]']"));
		destcity.click();
		
		driver.findElement(By.xpath("//div/input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(3)>td:nth-of-type(5)")).click();

		WebElement SearchBtn = driver.findElement(By.cssSelector("[id = 'search_btn']"));
		SearchBtn.click();
		//SearchBtn.click();
		Thread.sleep(2000);
	}
}
