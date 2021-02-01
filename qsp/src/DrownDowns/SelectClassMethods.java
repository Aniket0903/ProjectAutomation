package DrownDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Html%20Doc/Dropdown.html");
		WebElement target = driver.findElement(By.id("i0"));
		Select dropdown = new Select(target);
		dropdown.selectByIndex(3);
		Thread.sleep(5000);
		dropdown.selectByVisibleText("misal");
		Thread.sleep(3000);
		dropdown.selectByValue("i6");

	}

}
