package JavaScriptExecutor;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltillperticularWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
	    driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point loc = driver.findElement(By.xpath("//span[contains(.,'CATEGORY ')]")).getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
	}

}
