package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	
  @Test(groups = "Functional")
  public void FT1() {
	  
	  Reporter.log("Functional1");
  }
  
  @Test(groups = "Functional")
  public void FT2() {
	  
	  Reporter.log("Functional2");
  }
  
  @Test(groups = "Integration")
  public void IT1() {
	  
	  Reporter.log("Integration1");
  }
  
  @Test(groups = "System")
  public void ST1() {
	  
	  Reporter.log("System1");
  }
  
  @Test(groups = "System")
  public void ST2() {
	  
	  Reporter.log("System2");
  }
  
  @Test(groups = "Functional")
  public void FT3() {
	  
	  Reporter.log("Functional3");
  }
  
  @Test(groups = "Integration")
  public void IT2() {
	  
	  Reporter.log("Integration2");
  }
  
  @Test(groups = "Integration")
  public void IT3() {
	  
	  Reporter.log("Integration3");
  }
  
  @Test(groups = "System")
  public void ST3() {
	  
	  Reporter.log("System3");
  }
  
  @Test(groups = "Functional")
  public void FT4() {
	  
	  Reporter.log("Functional4");
  }
  
  @Test(groups = "Integration")
  public void IT4() {
	  
	  Reporter.log("Integration4");
  }
  
  @Test(groups = "System")
  public void ST4() {
	  
	  Reporter.log("System4");
  }
}
