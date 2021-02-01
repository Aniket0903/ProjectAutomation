package PopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String phandle = driver.getWindowHandle();
        System.out.println(phandle);
        Set<String> chandles = driver.getWindowHandles();
        for (String wh : chandles) {
        	System.out.println(wh);
			
		}
	}

}
