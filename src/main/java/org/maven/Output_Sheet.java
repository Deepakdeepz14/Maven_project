package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Output_Sheet {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admine\\Documents\\Write.sheets.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("write_data2").createRow(0).createCell(0).setCellValue("name");
		
		wb.getSheet("write_data2").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("write_data2").createRow(1).createCell(0).setCellValue("Deepak");
		
		wb.getSheet("write_data2").getRow(1).createCell(1).setCellValue("villan");
		
	    FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("write that succesfully");
		

	}

}