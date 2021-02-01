package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-62ebpuf/login.do");
		WebElement un = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		WebElement ln = driver.findElement(By.id("loginButton"));
		un.sendKeys("admin");
		pwd.sendKeys("manager");
		driver.navigate().refresh();
		ln.click();

	}

}
