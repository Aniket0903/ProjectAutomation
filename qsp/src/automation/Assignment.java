package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Html%20Doc/Filename.html");
		driver.findElement(By.id("i1")).sendKeys("dsdgcgjgghvm");
		driver.findElement(By.id("i2")).sendKeys("password");

	}

}
