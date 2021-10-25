package Selenium.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	 public class Calculation
	 {

	 public static void main(String[] args) 
	 {
	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
       ChromeDriver cdriver = new ChromeDriver();
	   cdriver.get("https://www.calculator.net/bmi-calculator.html?ctype=standard&cage=25&csex=m&cheightfeet=5&cheightinch=10&cpound=160&cheightmeter=180&ckg=65&printit=0");
	  
	   WebElement elem = cdriver.findElement(By.id("cage"));
			   
			   elem.clear();
			   elem.sendKeys("24");
			   WebElement Ckeck = cdriver.findElement(By.id("csex2"));
               Ckeck.click();
               WebElement height = cdriver.findElement(By.id("cheightfeet"));
			   height.clear();
			   height.sendKeys("4");
			   WebElement heightinch = cdriver.findElement(By.id("cheightinch"));
			   heightinch.clear();
			   heightinch.sendKeys("20");
			   WebElement Weight = cdriver.findElement(By.id("cpound"));
			   Weight.clear();
			   Weight.sendKeys("50");
			   WebElement Calci = cdriver.findElement(By.cssSelector("input[value='Calculate']"));
			   Calci.click();
	  }
  }