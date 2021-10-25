package switching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.swing.plaf.synth.SynthSpinnerUI;

import utilities.SeleniumUtils;

public class framePromp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();		
		util.setUp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver=util.driver;
		//handleAlertPopup();
		Thread.sleep(2000);
		//handleConfirmatioPopup();
		Thread.sleep(2000);
		handlePromptPopup();
}
	static void handlePromptPopup() {
		WebElement e1=driver.findElement(By.xpath("//iframe[@name = 'iframeResult']"));
		driver.switchTo().frame(e1);
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		driver.switchTo().alert().sendKeys("Rohit Waghmare");
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
		}
}