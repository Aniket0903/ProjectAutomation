package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class FlipkartSS {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		// TakesScreenshot ts = (TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./ScreenShots/FlipkartHomePage.png");
		//Files.copy(src, dest);
		
		//RemoteWebDriver rwd = (RemoteWebDriver)driver;
		//File src1 = rwd.getScreenshotAs(OutputType.FILE);
		//File dest1 = new File("./ScreenShots/FlipkartPage.png");
		//Files.copy(src1, dest1);
		
	    EventFiringWebDriver wd = new EventFiringWebDriver(driver);
		File src2 = wd.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./ScreenShots/FlipkartPage1.png");
		Files.copy(src2, dest2);

	}


}
