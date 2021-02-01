package MethodDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageobjectModelLogin {

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
	
	
	public PageobjectModelLogin(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
	}
	
	public void loginprocess(String un,String pwd) throws InterruptedException {
	
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
		username.clear();
	
	}
	}

