package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lockaters {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("abcdefghijk");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
