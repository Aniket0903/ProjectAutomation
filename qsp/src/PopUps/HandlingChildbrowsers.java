package PopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildbrowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String phandle = driver.getWindowHandle();
        System.out.println(phandle);
        String ptitle = driver.getTitle();
        System.out.println(ptitle);
        Set<String> whandle = driver.getWindowHandles();
        for (String wh : whandle) {
        	String title = driver.switchTo().window(wh).getTitle();
        	if (!title.equals(ptitle)) {
        		Thread.sleep(2000);
        		driver.switchTo().window(wh).close();
				
			}
			
		}
	}

}
