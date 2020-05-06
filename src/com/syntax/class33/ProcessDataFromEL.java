package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromEL {
	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "\\Date\\Data_Excel.xlsx";
		System.out.println(filePath);
		
		FileInputStream fileIS = new FileInputStream(filePath);

		// get the whole file
		Workbook book = new XSSFWorkbook(filePath);

		// get the sheet from the file
		Sheet sheet = book.getSheet("Sheet3");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> xlData = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int c = 0;c<cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value  =sheet.getRow(r).getCell(c).toString();
				map.put(key, value);			
			}
			xlData.add(map);
		}
		for(Map<String, String> xl:xlData) {
		System.out.println(xl);
		}
	
	}
}
