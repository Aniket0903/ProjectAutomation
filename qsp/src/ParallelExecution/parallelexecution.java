package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecution {
	
	WebDriver driver;
  @Test
  public void createuser() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-62ebpuf/login.do");
  }


@Test
public void createreport() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
}
}
