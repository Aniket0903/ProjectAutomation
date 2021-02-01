package automation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
         Dimension ds = new Dimension(100, 200);
         driver.manage().window().setSize(ds);
         Point p = new Point(200,400);
         driver.manage().window().setPosition(p);

	}

}
