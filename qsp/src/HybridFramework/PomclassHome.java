package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomclassHome {

	@FindBy(xpath="//a[@class='content reports']") private WebElement reports;
	@FindBy(xpath="//a[@class='content users']") private WebElement users;
	@FindBy(xpath="//a[@class='content tasks']") private WebElement tasks;
	@FindBy(xpath="//a[@class='content calendar']") private WebElement workschedule;
	@FindBy(xpath="//a[@class='content administration']") private WebElement settings;
	public WebElement getReports() {
		return reports;
	}
	public WebElement getUsers() {
		return users;
	}
	public WebElement getTasks() {
		return tasks;
	}
	public WebElement getWorkschedule() {
		return workschedule;
	}
	public WebElement getSettings() {
		return settings;
	}
	public PomclassHome(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonreports() {
		reports.click();
	}
	
	public void clickonusers() {
		users.click();
	}
	
	public void clickontasks() {
		tasks.click();
	}
	
	public void clickonwork() {
		workschedule.click();
	}
	
	public void clickonsettings() throws InterruptedException {
		
		settings.click();
	}
}
