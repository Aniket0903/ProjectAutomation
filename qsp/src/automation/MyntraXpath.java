package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Shirts",Keys.ENTER);
		String prize = driver.findElement(By.xpath("//h3[.='WROGN']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']")).getText();
        System.out.println(prize);
	}

}
