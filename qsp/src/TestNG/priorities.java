package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorities {
  @Test
  public void fun() 
  {
	  Reporter.log("fun",true);
  }
  
  @Test(priority = 0)
  public void run() 
  { 
	  Reporter.log("run",true);
  }
  
  @Test
  public void mann() 
  {  
	  Reporter.log("mann",true);
  }
  
  @Test(priority = 1)
  public void sun() 
  {  
	  Reporter.log("sun",true);
  }
  
}
