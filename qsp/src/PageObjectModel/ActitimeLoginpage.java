package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginpage {
	
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public ActitimeLoginpage(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername() {
		username.sendKeys("admin");
	}
	
	public void enterpassword() {
		password.sendKeys("manager");
	}
	
	public void clicklogin() {
		login.click();
	}
	}
	
