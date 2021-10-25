package switching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.swing.plaf.synth.SynthSpinnerUI;
import utilities.SeleniumUtils;
public class HandleAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();		
		util.setUp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver=util.driver;
		handleAlertPopup();
		Thread.sleep(2000);
		//handleConfirmatioPopup();
		//Thread.sleep(2000);
		//handlePromptPopup();
}
static void handleAlertPopup() {
WebElement e1=driver.findElement(By.xpath("//iframe[@name = 'iframeResult']"));
driver.switchTo().frame(e1);
driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
}

}
