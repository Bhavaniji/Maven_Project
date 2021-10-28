package com.ProjectUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static Properties prop;
	public static File file;
	public PropertyReader() throws IOException {
	
	try {
		file = new File("./AppFiles/login.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		if(file.exists()) {
			System.out.println("File loaded sucessfully");
		}
		else {
			System.out.println("Does not loaded");
		}
	}

}
	
	public String getappanme() {
		return prop.getProperty("appname");
	}
	
	public String getappurl() {
		return prop.getProperty("appurl");
	}
}