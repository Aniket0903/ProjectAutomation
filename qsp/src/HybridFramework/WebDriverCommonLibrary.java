package HybridFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLibrary extends BaseTest {
 
	public void gettext() {
		 
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void waitforelement(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void waitforpagetoload(int time, String expectedtitle) {
		 WebDriverWait wait = new WebDriverWait(driver, time);
		 wait.until(ExpectedConditions.titleContains(expectedtitle));	 
	}
		
	public void selectDropDownByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		 List<WebElement> allselectedops = sel.getOptions();
			for (WebElement we : allselectedops) {
			System.out.println(we.getText());
	}
	}
	
	
	public void selectDropDownByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectDropDownByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
}
