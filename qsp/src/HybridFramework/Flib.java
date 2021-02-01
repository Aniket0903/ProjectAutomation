package HybridFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String getproperties(String path,String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(path);
	    Properties prop = new Properties();
	    prop.load(fis);
	    String value = prop.getProperty(key);
		return value;
	}
	
	public String readexcel(String path,String sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		 
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String excelvalue = cell.getStringCellValue();
		return excelvalue;	
	}
	
	public int getrowcount(String path,String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		int rc = sh.getLastRowNum();
		return rc;
	}

}
