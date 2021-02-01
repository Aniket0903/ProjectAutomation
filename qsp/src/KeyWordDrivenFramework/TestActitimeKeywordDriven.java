package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActitimeKeywordDriven extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		ReadProp re = new ReadProp();
		String username = re.getProertyData("./data/keyvalues.properties", "un");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		String password = re.getProertyData("./data/keyvalues.properties", "psw");
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		bt.closebrowser();
		

	}

}
