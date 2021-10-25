package switching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.swing.plaf.synth.SynthSpinnerUI;

import utilities.SeleniumUtils;
public class HandlingFramesPrompt {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();		
		util.setUp("https://demoqa.com/alerts");
		driver=util.driver;
		//handleAlertPopup();
		Thread.sleep(2000);
		//handleConfirmatioPopup();
		Thread.sleep(2000);
		handlePromptPopup();

	}
	static void handlePromptPopup() {
		//to open prompt popup
				driver.findElement(By.id("promtButton")).click();
				//switch your control to prompt popup
//				String promptPopupText=driver.switchTo().alert().getText();
//				System.out.println("prompt Popup text: "+promptPopupText);
						//or
				System.out.println(driver.switchTo().alert().getText());
				//type text in popup
				driver.switchTo().alert().sendKeys("Selenium Testing");
				//to accept alert or to click on ok or yes button use
				driver.switchTo().alert().accept();
				//to click on cancel or no button
				//driver.switchTo().alert().dismiss();
	}

}
