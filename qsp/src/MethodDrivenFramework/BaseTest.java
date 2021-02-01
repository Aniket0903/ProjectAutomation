package MethodDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	static WebDriver driver;
	public void openbrowser() throws IOException
	{
	  ActtimeLoginMethods browser = new ActtimeLoginMethods();
	  String bw = browser.readproperties("./data/keyvalues.properties", "browser");
	  String url1 = browser.readproperties("./data/keyvalues.properties", "url");
	  
	  
	  if (bw.equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(url1);
			}
	  
	  else if (bw.equals("Firefox")) {
		
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(url1);
	}
	  
	  else {
		  
		  System.out.println("plz enter valid browser");
	  }
	}
	  
	  
	  public void closebrowser() {
			driver.close();
		}
	  
}
