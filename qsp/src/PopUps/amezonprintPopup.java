package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amezonprintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_P);
		ro.keyRelease(KeyEvent.VK_P);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		File ff = new File("./AutoitScripts/AmezonPrintAutoit.exe");
		String abs = ff.getAbsolutePath();
		Runtime.getRuntime().exec(abs);

	}

}
