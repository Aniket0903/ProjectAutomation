package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclasssettings {

	@FindBy(name="firstHierarchyLevelCode") private WebElement customerdropdown;
	@FindBy(name="secondHierarchyLevelCode") private WebElement projectdropdown;
	@FindBy(name="thirdHierarchyLevelCode") private WebElement taskdropdown;
	@FindBy(xpath="//a[.='Logo & Color Scheme']") private WebElement logo;
	@FindBy(name="colorScheme") private WebElement colorschemedropdown;
	
	public WebElement getCustomerdropdown() {
		return customerdropdown;
	}
	public WebElement getProjectdropdown() {
		return projectdropdown;
	}
	public WebElement getTaskdropdown() {
		return taskdropdown;
	}
	public Pomclasssettings(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickoncustomerdropdown() {
		customerdropdown.click();
		return customerdropdown;
	}
	
	public WebElement clickonprojectdropdown() {
		projectdropdown.click();
		return projectdropdown;
	}
	
	public WebElement clickontaskdropdown() {
		taskdropdown.click();
		return taskdropdown;
	}
	
	public void clickonlogo() {
		logo.click();
	}
	
	public WebElement clickoncolordropdown() {
		colorschemedropdown.click();
		return colorschemedropdown;
	}
	
}
