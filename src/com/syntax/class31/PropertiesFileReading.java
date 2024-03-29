package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException {
		
		//to read the file
		//1.have file
		
		String filePath = "/Users/�����/eclipse-workspace/JavaBasics/configs/Example.properties";
		
		//2. bring object of FileInputStream
		
		FileInputStream fileInput = new FileInputStream(filePath);
		
		
		//to handle data from .properties file we need Properties Class
		Properties prop = new Properties();
		prop.load(fileInput);
		
		String name = prop.getProperty("name");
		System.out.println(name);
		
		String city = prop.getProperty("city");
		System.out.println(city);
		
		System.out.println();
		Set<Object> keys = prop.keySet();
		for(Object k:keys) {
			System.out.println(k);
		}
	
	}

}
