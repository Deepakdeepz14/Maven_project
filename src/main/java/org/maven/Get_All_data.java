package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat.Type;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_All_data {

	public static void All_data( ) throws IOException {
		
		File f = new File("C:\\Users\\Admine\\eclipse-workspace\\maven\\Testcase\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++)
			
		{
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++)
				
			{
				
			Cell c = r.getCell(j);	
			
			CellType type = c.getCellType();
			
			if (type.equals(CellType.STRING));
			{
			 
				String value = c.getStringCellValue();
				System.out.println(value);
				
			}
		
			if (type.equals(CellType.NUMERIC))
			
			{
			
			double numericvalue = c.getNumericCellValue();
			
			String value = String.valueOf(numericvalue);
			
			System.out.println(value);
			
			
			 {
			int v = (int) numericvalue ;
			
			String value2 = Integer.toString(v);
			
			System.out.println(value2);
			
			}
		}
	}
	
wb.close();
	}
		
	}		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		All_data();

	}

}	
