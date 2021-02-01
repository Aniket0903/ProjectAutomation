package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		Thread.sleep(3000);
		new ChromeDriver().close();
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		Thread.sleep(3000);
		new FirefoxDriver().close();

	}

}
