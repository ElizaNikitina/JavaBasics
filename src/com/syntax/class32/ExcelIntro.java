package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	public static void main(String[] args) throws IOException {

		String filePath = "D:\\syntax_учеба\\Excel_test\\Data_Excel.xlsx";

		FileInputStream file = new FileInputStream(filePath);

		Workbook wbook = new XSSFWorkbook(file);

		Sheet sheet = wbook.getSheet("Sheet1");

		Row row1 = sheet.getRow(0);

		Cell cell = row1.getCell(1);
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);
		
		Row row3 = sheet.getRow(2);
		Cell r3c3 = row3.getCell(2);
		String cellValue = r3c3.toString();
		System.out.println(cellValue);
		
		
		

	}
}
