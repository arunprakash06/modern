package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {
	public static void main(String[] args) throws IOException {
		

		File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\src\\test\\resources\\create.xlsx");
        Workbook w=new XSSFWorkbook();
        Sheet s = w.createSheet("sheet1");
        Row r = s.createRow(1);
        Cell c = r.createCell(0);
        c.setCellValue("Arun");
        FileOutputStream fo=new FileOutputStream(f);
        w.write(fo);
        System.out.println("done");

	}

}
