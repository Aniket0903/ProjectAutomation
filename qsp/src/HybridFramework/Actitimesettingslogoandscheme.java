package HybridFramework;

import java.io.IOException;

public class Actitimesettingslogoandscheme extends BaseTest{

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
		set.clickonlogo();
		lib.selectDropDownByIndex(set.clickoncolordropdown(), 0);
		bt.closebrowser();
}
}
