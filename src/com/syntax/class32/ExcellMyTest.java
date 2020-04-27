package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellMyTest {
	
	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\Ёлиза\\eclipse-workspace\\JavaBasics\\Date\\Data_Excel.xlsx";

		FileInputStream file = new FileInputStream(filePath);

		// get an Object of Workbook type
		Workbook wbook = new XSSFWorkbook(file);
		Sheet sheet = wbook.getSheet("Sheet2");

		// need to find number of rows

		int rows = sheet.getPhysicalNumberOfRows();

		// need to find number of columns

		int colls = sheet.getRow(0).getLastCellNum();
		
		//System.out.println(rows + " " + colls);
		
		//get data from rows and all columns
		
		for (int r = 0; r<rows; r++) {
			for(int c=0; c<colls; c++ ) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+ "      ");
			}
			System.out.println();
		}

	}

	}


