package switching;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtils;
public class WindowHandling {

	static WebDriver driver;
	public static void main(String[] args) 
	{

		SeleniumUtils util=new SeleniumUtils();
		
		util.setUp("https://demoqa.com/browser-windows");
		driver=util.driver;
		System.out.println("Home window currentURL: "+driver.getCurrentUrl());
		//to get current window id
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id: "+homeWinId);
		//click on button to open new tab/window
		driver.findElement(By.id("windowButton")).click();
		//get the window ids of all the browser window open by webdriver
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All win ids: "+allWinIds);

  }
}	
