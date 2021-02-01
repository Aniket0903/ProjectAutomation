package DrownDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstselectedoptionmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Html%20Doc/Dropdown.html");
		WebElement target = driver.findElement(By.id("i0"));
		Thread.sleep(5000);
		Select dropdown = new Select(target);
		for (int i = 0; i < 5; i++) {
			dropdown.selectByIndex(i);
			
		}
		
	    WebElement firstop = dropdown.getFirstSelectedOption();
	    System.out.println(firstop.getText());
		
	
	}

}
