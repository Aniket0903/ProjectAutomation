package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KeyWordDrivenFramework.BaseTest;

public class ActiometimeloginCode {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://desktop-62ebpuf/login.do");
	ActitimeLoginpage lp = new ActitimeLoginpage(driver);
	lp.enterusername();
	lp.enterpassword();
	lp.clicklogin();
	}

}
