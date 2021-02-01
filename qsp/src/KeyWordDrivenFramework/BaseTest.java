package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    
	static WebDriver driver;
	public void openbrowser() throws IOException {
		ReadProp browser = new ReadProp();
		String browservalue = browser.getProertyData("./data/keyvalues.properties", "browser");
		String urlvalue = browser.getProertyData("./data/keyvalues.properties", "url");
		
		if (browservalue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(urlvalue);
			
		}
		
		else if (browservalue.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(urlvalue);
			
		}
		
		else {
			System.out.println("Plz Enter Valid Browser");
			
		}

	}
	
	public void closebrowser() {
		driver.close();
	}
	}


