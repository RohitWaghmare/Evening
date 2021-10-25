package TestNGSample;

import org.testng.annotations.Test;

public class Sample1 {
	int age = 23;
  @Test
  public void testCase1() {
	  System.out.println("Test");
	  System.out.println("Age:" + age);
  }
  @Test
  public void testCase3() {
	  System.out.println("Test2");
	  System.out.println("Age:" + age);
  }
}
