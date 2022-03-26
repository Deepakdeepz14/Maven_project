package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Cell {
	
	public static void getcell() throws IOException {
		
		File f  = new File("C:\\Users\\Admine\\eclipse-workspace\\maven\\Testcase\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheets = w.getSheetAt(0);
		Row row1 = sheets.getRow(1);
		Cell cells = row1.getCell(0);
		CellType Type = cells.getCellType();
		
		if (Type.equals(CellType.STRING)) {
			String sv = cells.getStringCellValue();
			System.out.println("My Name is : "+ sv);
		}
		else if (Type.equals(CellType.NUMERIC)) {
			double nv = cells.getNumericCellValue();
			System.out.println("My Name is : " +nv );
		}
		w.close();
	}

	public static void main(String[] args) throws IOException {
		
		getcell();
      
 
	}

}
