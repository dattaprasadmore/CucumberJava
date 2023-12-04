package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	/*
	 * This method is used to load the Properties from config.properties file.
	 * @Return Properties prop object.
	 * */
	
	public Properties init_prop() {
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Atharv\\git\\CucumberJava\\CucumberJava\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
		return prop;
	}
}
