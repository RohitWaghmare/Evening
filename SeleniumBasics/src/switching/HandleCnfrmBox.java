package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class HandleCnfrmBox {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();		
		util.setUp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver=util.driver;
		//handleAlertPopup();
		//Thread.sleep(2000);
		handleConfirmationPopup();
		Thread.sleep(2000);
		//handlePromptPopup();
}
static void handleConfirmationPopup() {
WebElement e1=driver.findElement(By.xpath("//iframe[@name = 'iframeResult']"));
driver.switchTo().frame(e1);
driver.findElement(By.xpath("//button[text() = 'Try it']")).click();

String confirmationPopupText=driver.switchTo().alert().getText();
System.out.println("confirmation Popup text: "+confirmationPopupText);
//to accept alert or to click on ok or yes button use
driver.switchTo().alert().accept();
  }
}
