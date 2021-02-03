package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testactitime {
	WebDriver driver;
	String appurl="http://desktop-62ebpuf/login.do";
	@BeforeClass
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		driver.get(appurl);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
