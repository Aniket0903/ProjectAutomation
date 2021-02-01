package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotations {
  @Test
  public void testscript() {
	  Reporter.log("hi i Am the Main Script",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Hi iam Before Method",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Hi i am AfterMethod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("hi i Am Before Class",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("hi i Am After Class",true); 
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("hi i Am Before test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("hi i Am After Test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("hi i Am Before Suite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("hi i Am After Suite",true);
  }

}
