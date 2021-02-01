package HybridFramework;

import java.io.IOException;

public class ActitimeClicksettings extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		pomClass ln = new pomClass(driver);
		Flib flib = new Flib();
		WebDriverCommonLibrary lib = new WebDriverCommonLibrary();
		PomclassHome home = new PomclassHome(driver);
		Pomclasssettings set = new Pomclasssettings(driver);
		String username = flib.getproperties(PROPERTIES_PATH,"un");
		String password = flib.getproperties(PROPERTIES_PATH,"psw");
		ln.loginprocess(username, password);
		lib.waitforelement(20);
		home.clickonsettings();
		set.clickoncustomerdropdown();
		lib.selectDropDownByIndex(set.clickoncustomerdropdown(), 0);
		lib.waitforelement(20);
		lib.selectDropDownByIndex(set.clickonprojectdropdown(), 0);
		lib.waitforelement(20);
		lib.selectDropDownByIndex(set.clickontaskdropdown(), 0);
		lib.waitforelement(20);
        bt.closebrowser();
	}
}
