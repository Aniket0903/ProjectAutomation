package KeyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./data/keyvalues.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty("url");
	System.out.println(value);

	}

}
