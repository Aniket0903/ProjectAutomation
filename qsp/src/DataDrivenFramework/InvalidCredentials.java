package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCredentials {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/OrangeHrmTestdata.xlsx", "InvalidCredentials");
		for (int i = 0; i <rc; i++) {	
		String username = flib.getCellData("./data/OrangeHrmTestdata.xlsx","InvalidCredentials" , rc, 0);
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		Thread.sleep(2000);
		String password = flib.getCellData("./data/OrangeHrmTestdata.xlsx","InvalidCredentials" , rc, 1);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		}

	}

}
