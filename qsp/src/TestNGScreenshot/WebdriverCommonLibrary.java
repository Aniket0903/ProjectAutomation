package TestNGScreenshot;

public class WebdriverCommonLibrary extends BastTest {
	
	public String gettitleofwebpage() {
		 
		String title = driver.getTitle();
		return title;
	}

}
