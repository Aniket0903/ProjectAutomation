package PopUps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUploadPopupUsingAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-62ebpuf/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Settings']/ancestor::td")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@style='padding-left:8px'])[1]")).click();
		File ff = new File("./AutoitScripts/Actitimeuploadautoit.exe");
		String  abs= ff.getAbsolutePath();
		Runtime.getRuntime().exec(abs);

	}

}
