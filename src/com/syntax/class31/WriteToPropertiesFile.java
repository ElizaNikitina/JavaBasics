package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		//write into existing file and add value
		
		String filePath = "/Users/Ёлиза/eclipse-workspace/JavaBasics/configs/Example.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		prop.setProperty("phoneNumber1", "123454546");
		
		FileOutputStream fos = new FileOutputStream (filePath);
		prop.store(fos, "added additional key");
		
		
	}

}
