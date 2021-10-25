package TestNGSample;

import org.testng.annotations.Test;

public class DependsOn {
  @Test(enabled=true)
  public void First() {
	  System.out.println("First step");
  }
  
  @Test(enabled=true)
  public void Second() {
	  System.out.println("Second step");
  }
  
  @Test(enabled=true, dependsOnMethods = "Second")
  public void Third() {
	  System.out.println("Third step");
  }
  
  @Test(enabled=true)
  public void Last() {
	  System.out.println("Close");
  }

  
}
