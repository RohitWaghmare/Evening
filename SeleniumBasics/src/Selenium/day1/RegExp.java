package Selenium.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RegExp {
	
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter required application url
		driver.get("http://demo.automationtesting.in/Register.html");				
		WebElement Name = driver.findElement(By.xpath("//div/input[@placeholder = 'First Name']"));
		Name.sendKeys("Rohit");
		Thread.sleep(1000);
		WebElement SurName = driver.findElement(By.xpath("//div/input[@placeholder = 'Last Name']"));
		SurName.sendKeys("Waghmare");
		WebElement Address = driver.findElement(By.tagName("textarea"));
		Address.sendKeys("Solapur");
		Thread.sleep(1000);
		WebElement emel = driver.findElement(By.xpath("//input[@type='email']"));
		emel.sendKeys("wrohit68@gmail.com");
		Thread.sleep(1000);

		WebElement Contact = driver.findElement(By.xpath("//input[@type='tel']"));
		Contact.sendKeys("8990674534");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.tagName("label"));
		System.out.println("Is selected:" + gender.isSelected());
		WebElement gender1 = driver.findElement(By.xpath("//input[@value='Male']"));
		gender1.click();
		Thread.sleep(1000);

		
		WebElement Hobbies = driver.findElement(By.tagName("label"));
		System.out.println("Is selected:" + Hobbies.isSelected());
		WebElement Hobbies1 = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hobbies1.click();
		Thread.sleep(1000);

		//driver.switchTo().frame("iframeResult");
		//1. Identify the dropdown list and store it into WebElement
		
		/*WebElement dropdownList = driver.findElement(By.id("Skills"));
	    Select s1 =  new Select(dropdownList);
	    System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
	    String selectedValue=s1.getFirstSelectedOption().getText();
	    System.out.println(selectedValue);
	    s1.selectByVisibleText("C");
	    System.out.println(s1.getFirstSelectedOption().getText());
	    driver.close();	*/
	    
		WebElement Skill = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select s1 = new Select(Skill);
		System.out.println("Is selected:" + s1.isMultiple());
		List<WebElement> WebList = s1.getOptions();
		System.out.println(WebList.size());
		for(int i = 0;i<WebList.size();i++)
		{
			System.out.println(WebList.get(i).getText());
		}
		String s2 = s1.getFirstSelectedOption().getText();
		System.out.println(s2);
		s1.selectByIndex(5);
		
		WebElement Birthyear = driver.findElement(By.id("yearbox"));
		Select b1 = new Select(Birthyear);
		System.out.println("Is selected:" + b1.isMultiple());
		
		List<WebElement> Option = b1.getOptions();
		System.out.println(Option.size());
		for(int i = 0;i<WebList.size();i++)
		{
			System.out.println(Option.get(i).getText());
		}
		
		String selectyear = b1.getFirstSelectedOption().getText();
		System.out.println("selectyear");
		b1.selectByVisibleText("1997");
		
		WebElement BMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select b2 = new Select(BMonth);
		System.out.println("Is selected:" + b2.isMultiple());
		List<WebElement> bm1 = b2.getOptions();
		
		String selectMonth = b2.getFirstSelectedOption().getText();
		System.out.println("selectMonth");
		b2.selectByVisibleText("May");

		WebElement BDate = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select b3 = new Select(BDate);
		System.out.println("Is selected:" + b3.isMultiple());
   
		
		List<WebElement> Option4 = b3.getOptions();
		String selectDay = b3.getFirstSelectedOption().getText();
		System.out.println(selectDay);
		b3.selectByVisibleText("2");

		WebElement firstpass = driver.findElement(By.xpath("//div/input[@id='firstpassword']"));
		firstpass.sendKeys("Rohit");
		//Thread.sleep(1000);
		
		WebElement Secondpass = driver.findElement(By.xpath("//div/input[@id='secondpassword']"));
		Secondpass.sendKeys("Rohit");
		//Thread.sleep(1000);


		/*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
	   WebElement as a parameter in its constructor  */ 
		/*Select s1 =  new Select(dropdownList);
		System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
		
		//Op1: count the options present in dropdown
		List<WebElement> options=s1.getOptions();
		System.out.println("Option  count: "+options.size());
		//op2: print all the option name
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		//op4: select required value from dropdown
		s1.selectByVisibleText("Volvo"); //or
		s1.selectByValue("opel");//or
		s1.selectByIndex(3);
		//Op5: get only selected options
		List<WebElement> selectedOption=s1.getAllSelectedOptions();
		System.out.println(selectedOption.size());
		for(int i=0;i<selectedOption.size();i++) {
			System.out.println(selectedOption.get(i).getText());
		}
		//op6: unselecting the selected options
		//s1.deselectByVisibleText("Volvo"); //or
		//s1.deselectByValue("html");//or
		//s1.deselectByIndex(7);
		s1.deselectAll();		
		
		//close current instance of browser
		driver.close();	*/		
}

}
