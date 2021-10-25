package TestNGSample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MethodAftrBfr {
  
  @BeforeMethod
  public void first()
  {
	  System.out.println("Execute 1:");
  }
  @Test
  public void Maintest() 
  {
	  System.out.println("Main:");
  }
  
  @Test
  public void MaintestTwo() 
  {
	  System.out.println("Main Two:");
  }

  @AfterMethod
  public void Last()
  {
	  System.out.println("Execute last:");
  }

}
