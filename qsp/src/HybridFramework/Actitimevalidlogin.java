package HybridFramework;

import java.io.IOException;

public class Actitimevalidlogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
	    Flib flib = new Flib();
	    pomClass pom = new pomClass(driver);
	    String username = flib.getproperties(PROPERTIES_PATH,"un");
	    String password = flib.getproperties(PROPERTIES_PATH,"psw");
	    pom.loginprocess(username, password);
		bt.closebrowser();
	}

}
