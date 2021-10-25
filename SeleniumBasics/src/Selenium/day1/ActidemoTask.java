package Selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActidemoTask {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter required application url
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* driver can wait for the element from 0-30 sec*/
		System.out.println("Page title before login: "+driver.getTitle());
		WebElement userNameInputField=driver.findElement(By.id("username"));
		//perform typing operation
		userNameInputField.sendKeys("admin");
		//identify password field
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		//perform typing operation
		passwordInputField.sendKeys("manager");
		//identify login button 
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//perform click operation
		loginButton.click();
		Thread.sleep(2000);
		System.out.println("Page title After login: "+driver.getTitle());
		Thread.sleep(2000);
		
		//Clicking on Task
		WebElement NewTask = driver.findElement(By.xpath("//div[@id='container_tasks']"));
		NewTask.click();
		Thread.sleep(2000);
		
		//Click on Add NewTask
		WebElement CreateTask = driver.findElement(By.xpath("//div[@class='title ellipsis']"));
		CreateTask.click();
		Thread.sleep(2000);
		
		WebElement AddNewTask = driver.findElement(By.xpath("//div[@class = 'item createNewTasks']"));
		AddNewTask.click();
		Thread.sleep(2000);
		
		/*WebElement CompanyList = driver.findElement(By.xpath("//div[@class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]/div/div[1]/div[1]"));
		CompanyList.click();
		Thread.sleep(2000);
		
		WebElement CompanySelect = driver.findElement(By.xpath("//div[@class=\"itemRow cpItemRow selected\"]"));
		CompanySelect.click();
		Thread.sleep(2000); */
		
		WebElement Project = driver.findElement(By.xpath("//div[@class=\"projectSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]/div/div[1]/div[3]"));
		Project.click();
		Thread.sleep(2000);
		
		WebElement ProjectList = driver.findElement(By.xpath("//div[@class=\"projectSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]/div/div[2]/div/div[1]/div/div[4]"));
		ProjectList.click();
		Thread.sleep(2000);
		
		WebElement EnterTask = driver.findElement(By.xpath("//div[@class=\"tablePlaceholder\"]/div/div[1]/table/tbody/tr[1]/td[1]/input"));
		EnterTask.click();
		EnterTask.sendKeys("Julia");
		Thread.sleep(2000);
		
		WebElement CreateTask1 = driver.findElement(By.xpath("//div[@class=\"commitButtonPlaceHolder\"]/div/div[1]"));
		CreateTask1.click();
		Thread.sleep(2000);
		
		WebElement Checkbox = driver.findElement(By.xpath("//div[@class = \"taskRowsTableContent\"]/div[1]/div[1]/table/tbody/tr/td[1]/div"));
		Checkbox.click();
		Thread.sleep(2000);
		
		WebElement Delete = driver.findElement(By.xpath("//div[@class=\"delete button\"]"));
		Delete.click();
		Thread.sleep(2000);
		
		WebElement Deletebtn = driver.findElement(By.xpath("//div[@class=\"dialogWithPointerWrapper deleteDialog\"]/div[1]/div[1]/div/div[5]/div[1]/div/span"));
		Deletebtn.click();
		Thread.sleep(2000);
		
		/*WebElement DeleteBtn = driver.findElement(By.xpath("//div[@id=\"loadTasksFromCSVPopup_commitBtn\"]/div[1]"));
		DeleteBtn.click();
		Thread.sleep(2000);
		
		WebElement Company = driver.findElement(By.xpath("//div[@class = 'emptySelection']"));
		Company.click();
		Thread.sleep(2000); 
		
		WebElement Create = driver.findElement(By.xpath("//div[@class = 'components_button withPlusIcon']/div[1]"));
		Create.click();
		Thread.sleep(2000); */
  }
}	
	
