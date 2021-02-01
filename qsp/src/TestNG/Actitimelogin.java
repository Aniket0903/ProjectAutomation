package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actitimelogin {
	WebDriver driver;
	
  @Test
  @Parameters({"username","password"})
  public void  login(String validusername,String validpassword) {
	  
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-62ebpuf/login.do");
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys(validusername);
    WebElement password = driver.findElement(By.name("pwd"));
    password.sendKeys(validpassword);
    driver.findElement(By.id("loginButton")).click();
    
  }
}
