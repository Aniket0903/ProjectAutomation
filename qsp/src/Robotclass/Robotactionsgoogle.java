package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotactionsgoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("samsung",Keys.ENTER);
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//span[contains(.,'Multinational')]"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Robot key = new Robot();
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_C);
		key.keyRelease(KeyEvent.VK_CONTROL);
		key.keyRelease(KeyEvent.VK_C);
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.clear();
		Thread.sleep(3000);
		textbox.click();
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		key.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
	
			
	}

}
