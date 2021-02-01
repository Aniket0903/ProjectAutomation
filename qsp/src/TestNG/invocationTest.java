package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationTest {
  @Test(invocationCount = 3)
  public void pune() {
	  Reporter.log("Pune is city of education",true);
  }
  
  @Test(invocationCount = 2)
  public void mumbai() {
	  Reporter.log("Mumbai is city of dreams",true);
  }
  
}
