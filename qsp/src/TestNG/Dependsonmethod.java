package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod {
  @Test(dependsOnMethods = "Login")
  public void Homepage() {
	  
	  Reporter.log("If the login is succesful then Homepage will be displayed",true);
  }
  
  @Test
  public void Login() {
	  
	  Reporter.log("Login is succesfull",true);
  }
  
  @Test(dependsOnMethods = "Login")
  public void Logout() {
	  
	  Reporter.log("If we login sucessfully then only we can logout",true);
  }
  
  @Test(description = "Hi You can give any kind of description")
  public void description() {
	  Reporter.log("descripion",true);
  }
}
