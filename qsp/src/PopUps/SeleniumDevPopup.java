package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDevPopup {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("(//a[.='Downloads'])[1]")).click();
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(3000);
//	    Robot ro = new Robot();
//		ro.keyPress(KeyEvent.VK_LEFT);
//		ro.keyRelease(KeyEvent.VK_LEFT);
		File ff = new File("./AutoitScripts/seleniumdevautoit.exe");
		String abs = ff.getAbsolutePath();
		Runtime.getRuntime().exec(abs);

	}

}
