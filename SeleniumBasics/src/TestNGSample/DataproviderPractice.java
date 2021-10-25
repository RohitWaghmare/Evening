package TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.BaseUtil;

public class DataproviderPractice extends BaseUtil{

	@Test(dataProvider = "DataForTest")
	public void testLoginOfVtiger(String browser, String username, String password) {
		setUp(browser, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		//driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(password, Keys.ENTER);
		driver.close();
	}

@DataProvider(name = "DataForTest")
	public Object[][] getUserDetails() {
		/**
		 * Rows - Number of times your test has to be repeated. Columns - Number of
		 * parameters in test data.
		 */
		Object[][] data = new Object[2][3];
		// 1st row
		data[0][0] = "chrome";
		data[0][1] = "Admin";
		data[0][2] = "admin123";
		// 2rd row
		data[1][0] = "chrome";
		data[1][1] = "Admin";
		data[1][2] = "admin12";
		// 3rd row
				
		return data;
	}
}
