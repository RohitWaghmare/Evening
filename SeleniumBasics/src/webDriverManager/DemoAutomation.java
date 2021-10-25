package webDriverManager;
import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\TestData\\AutoDemo.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String Durl = prop.getProperty("Durl");
		System.out.println(Durl);
		
		String First = prop.getProperty("First");
		String Last = prop.getProperty("Last");
		String Address = prop.getProperty("Address");
		String Email = prop.getProperty("Email");
		String Phone = prop.getProperty("Phone");
		String FPassword = prop.getProperty("FPassword");
		String SPassword = prop.getProperty("SPassword");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Durl);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		WebElement Name = driver.findElement(By.xpath("//div/input[@placeholder = 'First Name']"));
		boolean NameField = Name.isDisplayed();
		System.out.println("Username Dispayed:" + NameField);
		boolean NameField1 = Name.isEnabled();
		System.out.println("Username Enabled:" + NameField1);
		Name.sendKeys(First);
		Thread.sleep(1000);
		
		WebElement LName = driver.findElement(By.xpath("//div/input[@placeholder = 'Last Name']"));
		boolean LastField = Name.isDisplayed();
		System.out.println("Password Dispayed:" + LastField);
		boolean LastField1 = Name.isEnabled();
		System.out.println("Password Enabled:" + LastField1);
		LName.sendKeys(Last);
		Thread.sleep(1000);
		
		WebElement Add = driver.findElement(By.tagName("textarea"));
		boolean Patta = Add.isDisplayed();
		System.out.println("Address Dispayed:" + Patta);
		boolean Patta1 = Add.isEnabled();
		System.out.println("Address Enabled:" + Patta1);
		Add.sendKeys(Address);
		Thread.sleep(1000);

		WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
		boolean emd = em.isDisplayed();
		System.out.println("Email Dispayed:" + emd);
		boolean eme = em.isEnabled();
		System.out.println("Email Enabled:" + eme);
		em.sendKeys(Email);
	    Thread.sleep(2000);

		
		WebElement Contact = driver.findElement(By.xpath("//input[@type='tel']"));
		boolean ContactD = Contact.isDisplayed();
		System.out.println("Address Dispayed:" + ContactD);
		boolean ContactV = Contact.isEnabled();
		System.out.println("Address Enabled:" + ContactV);
		Contact.sendKeys(Phone);
	    Thread.sleep(2000);

		
		WebElement gender = driver.findElement(By.tagName("label"));
		boolean gendrD = gender.isDisplayed();
		System.out.println("gender Dispayed:" + gendrD);
		boolean gendrE = gender.isDisplayed();
		System.out.println("gender Enabled:" + gendrE);
		System.out.println("Is selected:" + gender.isSelected());
		WebElement gender1 = driver.findElement(By.xpath("//input[@value='Male']"));
		gender1.click();
		Thread.sleep(1000);

		
		WebElement Hobbies = driver.findElement(By.tagName("label"));
		System.out.println("Is selected:" + Hobbies.isSelected());
		WebElement Hobbies1 = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hobbies1.click();
		Thread.sleep(1000);
		
		WebElement dropdownList = driver.findElement(By.id("Skills"));
	    Select s1 =  new Select(dropdownList);
	    System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
	    String selectedValue=s1.getFirstSelectedOption().getText();
	    System.out.println(selectedValue);
	    s1.selectByVisibleText("C");
	    System.out.println(s1.getFirstSelectedOption().getText());
	    Thread.sleep(2000);

	    
	    WebElement Langlist= driver.findElement(By.xpath("//div[@id='msdd']"));
	    Langlist.click();
	    Thread.sleep(2000);
	    //Select c1 = new Select(Langlist);
		//System.out.println("Lang Multiple:" + c1.isMultiple());
		WebElement Langselect= driver.findElement(By.xpath("//a[text()='English']"));
		Langselect.click();
		Thread.sleep(1000); 
		
		WebElement Birthyear = driver.findElement(By.id("yearbox"));
		Select b1 = new Select(Birthyear);
		System.out.println("Is selected:" + b1.isMultiple());
		
		java.util.List<WebElement> Option = b1.getOptions();
		 System.out.println("Option Count:"+ Option.size());
		for(int i = 0;i<Option.size();i++)
		{
			System.out.println(Option.get(i).getText());
		}
		
		String selectyear = b1.getFirstSelectedOption().getText();
		System.out.println("selectyear");
		b1.selectByVisibleText("1997");
		
		WebElement BMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select b2 = new Select(BMonth);
		System.out.println("Is selected:" + b2.isMultiple());
		java.util.List<WebElement> bm1 = b2.getOptions();
		
		String selectMonth = b2.getFirstSelectedOption().getText();
		System.out.println("selectMonth");
		b2.selectByVisibleText("May");

		WebElement BDate = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select b3 = new Select(BDate);
		System.out.println("Is selected:" + b3.isMultiple());
   
		
		java.util.List<WebElement> Option4 = b3.getOptions();
		String selectDay = b3.getFirstSelectedOption().getText();
		System.out.println(selectDay);
		b3.selectByVisibleText("2"); 

		
		WebElement fp = driver.findElement(By.xpath("//div/input[@id='firstpassword']"));
		boolean fpd = fp.isDisplayed();
		System.out.println("Password1 Dispayed:" + fpd);
		boolean fpe = fp.isEnabled();
		System.out.println("Password1 Enabled:" + fpe);
		fp.sendKeys(FPassword);
		
		WebElement sp = driver.findElement(By.xpath("//div/input[@id='secondpassword']"));
		boolean spd = sp.isDisplayed();
		System.out.println("Password2 Dispayed:" + spd);
		boolean spe = sp.isEnabled();
		System.out.println("Password2 Enabled:" + spe);
		sp.sendKeys(SPassword);		

	}

}
