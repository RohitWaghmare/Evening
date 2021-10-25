package TestNGSample;

import org.testng.annotations.Test;

public class Enabled {
  @Test(enabled=true)
  public void openBrowseAndAppUrl() {
	  System.out.println("Open Browser");
  }
  
  @Test(enabled=true)
  public void login() {
	  System.out.println("login Browser");
  }
  
  @Test(enabled=false)
  public void createTask() {
	  System.out.println("Task Browser");
  }
  
  @Test(enabled=true)
  public void logout() {
	  System.out.println("Close Browser");
  }
}
