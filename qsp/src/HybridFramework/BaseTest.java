package HybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts {
	static WebDriver driver;
	public void openBrowser() throws IOException {
		 
		Flib flib = new Flib();
		String browservalue = flib.getproperties(PROPERTIES_PATH,"browser");
		String urlvalue = flib.getproperties(PROPERTIES_PATH,"url");
		
		if (browservalue.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(urlvalue);	
		}
		
		else if (browservalue.equals("Firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(urlvalue);
			
		}
		else {
			 System.out.println("Enter Valid Browser");
		}
	}
	
	public void closebrowser() {
		 driver.close();
	}
}
