package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementmethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		WebElement login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		Thread.sleep(3000);
		System.out.println(login.isEnabled());
		String attribute = login.getAttribute("class");
		System.out.println(attribute);
		String bgcolor = login.getCssValue("color");
		System.out.println(bgcolor);
		WebElement insta = driver.findElement(By.xpath("//h1[.='Instagram']"));
		Point loc = insta.getLocation();
		int dist1 = loc.getX();
		int dist2 = loc.getY();
		System.out.println("  "+ dist1 + "   " +  dist2);
		Dimension size = insta.getSize();
		int size1 = size.getHeight();
		int size2 = size.getWidth();
		System.out.println("  "+ size1 + "   " +  size2);
		boolean display = insta.isDisplayed();
		System.out.println(display);
		
		
		
		

	}

}
