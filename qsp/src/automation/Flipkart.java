package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("Admin ");
		Thread.sleep(2000);
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("admin123 ");
		Thread.sleep(2000);
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();

	}

}
