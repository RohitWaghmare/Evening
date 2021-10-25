package mouseAndKeyboardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation {

	static Actions action;
	static WebDriver driver;
	static void setUp(String appUrl) {
		WebDriverManager.chromedriver().setup();
		// creating an object of chromedriver class and upcasting it to WebDriver
		// interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter required application url
		driver.get(appUrl);
		action = new Actions(driver);
	}
	static void performMouseOverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}
	static void performRightClickOperation(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		setUp("https://www.globalsqa.com/demo-site/");
		// s2: identify the element in which you want to perform action
		WebElement freeBookLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
		//performMouseOverOperation(freeBookLink);
		
		//action.moveToElement(freeBookLink).contextClick().build().perform();
				//or
		//performRightClickOperation(freeBookLink);
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		WebElement source=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement target=driver.findElement(By.id("trash"));
		performDragAndDrop(source, target);
	}
	
	static void performDragAndDrop(WebElement source,WebElement target) {
		action.dragAndDrop(source, target).build().perform();
	}
}	