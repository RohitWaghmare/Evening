package Selenium.day1;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExercise {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
   ChromeDriver cdriver = new ChromeDriver();
   cdriver.get("https://www.google.com");
   System.out.println("Url:" + cdriver.getCurrentUrl());
   System.out.println("Title:" + cdriver.getTitle());
   
   Thread.sleep(5000);
   cdriver.close();
	}

}
