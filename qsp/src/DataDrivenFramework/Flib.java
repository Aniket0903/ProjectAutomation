package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
  
	public String getCellData(String path,String sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}
	public int getRowCount(String path,String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheet);
		int rowcount = sh.getLastRowNum();
		return rowcount;
		
		
	}
	}
	
	
