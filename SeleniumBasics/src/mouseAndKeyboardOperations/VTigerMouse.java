package mouseAndKeyboardOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class VTigerMouse 
{
	public static void main(String[] args) 
	{
		MouseOperation.setUp("http://vtiger-demo.it-solutions4you.com/index.php");
		WebElement userName=MouseOperation.driver.findElement(By.id("username"));
		MouseOperation.action.doubleClick(userName).build().perform();
   }
}	
