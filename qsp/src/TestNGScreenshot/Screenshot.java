package TestNGScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class Screenshot extends BastTest {
	
	@BeforeMethod
	public void setup()
	{
		initilization();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
  @Test
  public void screenshottestcase1() {
	  
	  Assert.assertEquals(true, false);
  }


@Test
public void screenshottestcase2() {
	   
	String title = new WebdriverCommonLibrary().gettitleofwebpage();
	Assert.assertEquals(title, "act-login");
}
}
