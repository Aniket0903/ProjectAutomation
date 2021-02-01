package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver().close();

	}

}
