package MethodDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ActitimeLogin extends BaseTest  {

	public static void main(String[] args) throws IOException, InterruptedException {
		 
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		ActtimeLoginMethods act = new ActtimeLoginMethods();
		PageobjectModelLogin pl = new PageobjectModelLogin(driver);
		int rowc = act.rowcount("./data/OrangeHrmTestdata.xlsx", "InvalidCredentials");
		for (int i = 1; i<=rowc-1; i++) {
			 String un = act.readexcelfile("./data/OrangeHrmTestdata.xlsx", "InvalidCredentials", i, 0);
			 String psw = act.readexcelfile("./data/OrangeHrmTestdata.xlsx", "InvalidCredentials", i, 1);
			 pl.loginprocess(un, psw); 	
		}
		bt.closebrowser();
	    
	
	}

}
