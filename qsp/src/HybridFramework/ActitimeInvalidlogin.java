package HybridFramework;

import java.io.IOException;

public class ActitimeInvalidlogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException  {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
	    Flib flib = new Flib();
	    pomClass pom = new pomClass(driver);
	    int rc1 = flib.getrowcount(EXCEL_PATH, "InvalidCredentials");
	    for (int i = 1; i <=rc1-1; i++) {
	    	
	    	String username = flib.readexcel(EXCEL_PATH, "InvalidCredentials", i, 0);
	    	String password = flib.readexcel(EXCEL_PATH, "InvalidCredentials", i, 1);
			pom.loginprocess(username, password);
		}
	    bt.closebrowser();

	}
	

}
