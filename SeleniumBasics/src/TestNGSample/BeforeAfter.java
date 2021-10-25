package TestNGSample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {

  @BeforeTest
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
  
  @AfterTest
  public void Last()
  {
	  System.out.println("Execute last:");
  }
}
