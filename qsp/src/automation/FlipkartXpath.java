package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earbuds",Keys.ENTER);
	    String price = driver.findElement(By.xpath("//span[.='Sony WF-XB700 Truly Wireless Extra Bass Bluetooth Earbuds/Headphones, True Wireless Earbuds with Mic for Phone Calls, 18 Hours Battery Life, Quick Charge, BT Ver 5.0 (Black)']/ancestor::div[@class='a-section a-spacing-medium']/descendant::span[@class='a-price-whole']")).getText();
	    System.out.println(price);

	}

}
