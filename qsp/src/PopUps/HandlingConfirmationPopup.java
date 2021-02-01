package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Html%20Doc/ConfirmationPopup.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.getText();
		al.accept();

	}

}
