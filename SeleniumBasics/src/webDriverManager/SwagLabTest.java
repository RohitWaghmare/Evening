package webDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabTest {

	public static void main(String args[]) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream(".\\TestData\\TestSwagLabs.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String surl = prop.getProperty("surl");
		System.out.println(surl);
		
		String FName = prop.getProperty("FName");
		String LName = prop.getProperty("LName");
		String Zip   = prop.getProperty("Zip");
		//int Z        = Integer.parseInt(Zip);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(surl);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		WebElement UName = driver.findElement(By.xpath("//div[@id= 'login_credentials']"));
		String getUName = UName.getText().split("\n")[1];
		System.out.println(getUName);
		WebElement usrName = driver.findElement(By.xpath("//div/input[@id= 'user-name']"));
		usrName.sendKeys(getUName);
		Thread.sleep(1000);
 
		WebElement UPwd = driver.findElement(By.xpath("//div[@class= 'login_password']"));
		String UserPwd = UPwd.getText().split("\n")[1];
		System.out.println(UserPwd);
		WebElement usrPaswrd = driver.findElement(By.xpath("//div/input[@id= 'password']"));
		usrPaswrd.sendKeys(UserPwd);
		
		WebElement LgnBtn = driver.findElement(By.cssSelector("input[id = 'login-button']"));
		boolean btn = LgnBtn.isDisplayed();
		System.out.println("Username Dispayed:" + btn);
		LgnBtn.click();
		Thread.sleep(1000);
		
		WebElement Price = driver.findElement(By.xpath("//div[@class= 'inventory_list']/div[1]/div[2]/div[2]"));
		//String UserPwd = UPwd.getText().split("\n")[1];
		System.out.println("Price:" + Price.getText());
		float ProdctPrice = Float.parseFloat(Price.getText().replace("$", " "));
		System.out.println("Float Price:" + ProdctPrice);
        driver.findElement(By.xpath("//button[@id= 'add-to-cart-sauce-labs-backpack']")).click();
        
        WebElement Price2 = driver.findElement(By.xpath("//div[@class= 'inventory_list']/div[1]/div[2]/div[2]"));
		System.out.println("Price:" + Price2.getText());
		float ProdctPrice2 = Float.parseFloat(Price.getText().replace("$", " "));
		System.out.println("Float Price:" + ProdctPrice2);
        driver.findElement(By.xpath("//button[@id= 'add-to-cart-sauce-labs-bike-light']")).click();
        
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        
        WebElement Aname = driver.findElement(By.id("first-name"));
        boolean first = Aname.isDisplayed();
		System.out.println("Username Dispayed:" + first);
		boolean first1 = Aname.isEnabled();
		System.out.println("Username Enabled:" + first1);
		Aname.sendKeys(FName);
        Thread.sleep(1000); 
        
        WebElement Bname = driver.findElement(By.cssSelector("input[id = 'last-name']"));
        boolean last = Bname.isDisplayed();
        System.out.println("Password Dispayed:" + last);
        boolean last1 = Bname.isEnabled();
		System.out.println("Password Enabled:" + last1);
		Bname.sendKeys(LName);
        Thread.sleep(1000);
        
        WebElement Pcode = driver.findElement(By.cssSelector("input[id = 'postal-code']"));
        boolean post = Pcode.isDisplayed();
        System.out.println("Zip Dispayed:" + post);
        boolean post1 = Pcode.isEnabled();
		System.out.println("Zip Enabled:" + post1);
		Pcode.sendKeys(Zip);
        Thread.sleep(1000); 
        
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000); 

        float count = ProdctPrice + ProdctPrice2;
        String TotalPrice = "$" + String.valueOf(count);
		System.out.println("Total Price:" + TotalPrice);
		
		WebElement CalPrice = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
		String resultPrice = CalPrice.getText().split(":")[1].trim();
		System.out.println("Total Price:" + resultPrice);
        Thread.sleep(2000); 

		System.out.println("Actual & Expectede:" + TotalPrice.equals(resultPrice));
		driver.findElement(By.id("react-burger-menu-btn")).click();
		WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
		Logout.click();
        Thread.sleep(1000); 

		System.out.println("Login btn Enabled:" + Logout.isEnabled());
		System.out.println("Login btn Displayed:" + Logout.isDisplayed());

		



        
		
	}
}
