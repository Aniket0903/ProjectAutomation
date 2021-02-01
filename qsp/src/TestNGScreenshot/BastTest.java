package TestNGScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BastTest {
	
	static WebDriver driver;
	public static void initilization() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-62ebpuf/login.do");
	}
	
	public void failed(String methodname)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./TestNGscreenshot/"+ methodname +".png");
		Files.copy(src, dest);
		}
		catch(IOException e)
		{
		}
		
		}
	}


