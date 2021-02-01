package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Browser Which You Want To launch");
		String chosenBrowser = sc.next();
		
		if(chosenBrowser.equalsIgnoreCase("Chrome"))
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.close();
	 
}
else if (chosenBrowser.equalsIgnoreCase("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.close();
}
		else {
			System.out.println("Enter Valid Browser");
		}
	
		

	}

}
