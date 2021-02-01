package ScreenShots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSusingvirtualkeys {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_PRINTSCREEN);
		ro.keyRelease(KeyEvent.VK_PRINTSCREEN);

	}

}
