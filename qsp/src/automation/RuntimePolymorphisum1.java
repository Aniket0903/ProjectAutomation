package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphisum1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the browser");
		String chosenbrowser= sc.next();
		if (chosenbrowser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
			
			else if (chosenbrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().fullscreen();
				Thread.sleep(2000);
				driver.close();
				
				
			}
			else {
			 System.out.println("Enter valid browesr name");
			}
			
		}
		

	}

