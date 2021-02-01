package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCredentials {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Flib flib = new Flib();
		String username = flib.getCellData("./data/OrangeHrmTestdata.xlsx","Validcredentials" , 1, 0);
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		Thread.sleep(2000);
		String password = flib.getCellData("./data/OrangeHrmTestdata.xlsx","Validcredentials" , 1, 1);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();

	}

}
