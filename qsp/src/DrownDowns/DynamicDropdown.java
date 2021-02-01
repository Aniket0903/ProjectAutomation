package DrownDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(5000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
        for (WebElement we : suggestions) {
        	System.out.println(we.getText());
			
		}
        
        for (int i = 0; i <=suggestions.size(); i++) {
        	
        	String text = suggestions.get(i).getText();
        	if (text.contains("in Laptops")) {
        		suggestions.get(i).click();
        		break;
        	
			}
        	Thread.sleep(4000);
        	
			WebElement target = driver.findElement(By.xpath("//div[@class='_3uDYxP']/descendant::select[@class='_2YxCDZ']"));
			Select dropdown = new Select(target);
			dropdown.selectByVisibleText("₹50000");
			driver.navigate().refresh();
		}
	}

}
