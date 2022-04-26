package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\src\\test\\resources\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		int type = cell.getCellType();
		System.out.println(type);
		if (type==1) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}else {
			if (DateUtil.isCellInternalDateFormatted(cell)) {
				Date dd = cell.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
				String value = sd.format(dd);
				System.out.println(value);
				
			}else {
				double db = cell.getNumericCellValue();
				long ln= (long) db;
				String value = String.valueOf(ln);
				System.out.println(value);
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
