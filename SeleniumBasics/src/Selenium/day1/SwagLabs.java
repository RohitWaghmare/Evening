package Selenium.day1;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabs
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter required application url
		driver.get("https://www.saucedemo.com/");
		WebElement Uname = driver.findElement(By.xpath("//div/input[@id='user-name']"));
		boolean u = Uname.isDisplayed();
		System.out.println("Username Dispayed:" + u);
		boolean u1 = Uname.isEnabled();
		System.out.println("Username Enabled:" + u1);
		Uname.sendKeys("standard_user");
		Thread.sleep(1000);
		
		//Password Field
		WebElement paswrd = driver.findElement(By.xpath("//div/input[@id='password']"));
		boolean pwd = paswrd.isDisplayed();
		System.out.println("Username Dispayed:" + pwd);
		boolean pwd1 = Uname.isEnabled();
		System.out.println("Username Enabled:" + pwd1);
		paswrd.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		//Login
		WebElement LgnBtn = driver.findElement(By.cssSelector("input[id = 'login-button']"));
		boolean btn = LgnBtn.isDisplayed();
		System.out.println("Username Dispayed:" + btn);
		LgnBtn.click();
		Thread.sleep(1000);
		
		//Shopping
		
		WebElement item = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        item.click();
        Thread.sleep(1000);
        
        WebElement item2 = driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-bike-light']"));
        item2.click();
        Thread.sleep(1000);
        
        //Cart
        
        WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        cart.click();
        Thread.sleep(1000);
        
        //Ckeckout
        
        WebElement check = driver.findElement(By.cssSelector("[data-test = \"checkout\"]"));
        check.click();
        Thread.sleep(5000);
        
        //Users Information
        WebElement fname = driver.findElement(By.cssSelector("input[id = 'first-name']"));
        boolean first = fname.isDisplayed();
		System.out.println("Username Dispayed:" + first);
		boolean first1 = fname.isEnabled();
		System.out.println("Username Enabled:" + first1);
		fname.sendKeys("Rohit");
        Thread.sleep(1000);
        
        WebElement lname = driver.findElement(By.cssSelector("input[id = 'last-name']"));
        boolean last = lname.isDisplayed();
        System.out.println("Username Dispayed:" + last);
        boolean last1 = lname.isEnabled();
		System.out.println("Username Enabled:" + last1);
		lname.sendKeys("Waghmare");
        Thread.sleep(1000);
        
        WebElement Pcode = driver.findElement(By.cssSelector("input[id = 'postal-code']"));
        boolean zip = Pcode.isDisplayed();
        System.out.println("Username Dispayed:" + zip);
        boolean zip1 = lname.isEnabled();
		System.out.println("Username Enabled:" + zip1);
		Pcode.sendKeys("413008");
        Thread.sleep(1000); 
		
     }
}	
