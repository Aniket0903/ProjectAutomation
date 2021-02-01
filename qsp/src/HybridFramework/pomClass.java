package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClass {
	
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement loginbtn;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public pomClass(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}
	
	public void loginprocess(String un,String psw) throws InterruptedException {
		
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(psw);
		Thread.sleep(3000);
		loginbtn.click();
	}
}
