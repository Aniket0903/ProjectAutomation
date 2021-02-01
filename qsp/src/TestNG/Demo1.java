package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
 

public class Demo1 {
  @Test
  public void run() {
	  
	  Reporter.log("Hi im run method",true);
  }
}
