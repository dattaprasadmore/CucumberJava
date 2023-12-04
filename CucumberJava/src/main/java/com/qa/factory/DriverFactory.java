package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Here we are using ThreadLocal - Because tomorrow we want to execute it on parallel mode. 

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/**************
	 * This method is used to initialize the threadlocal driver on the basis of given browser
	 * @param browser
	 * @return this will return tldriver.
	 * */
	
	/* SRP - According to SRP (Single Responsibility) Concept EVERY class should behave let say 
	 * for Driver Factory is responsible for a specific work only for Driver. I can not write here 
	 * read property from configuration here, For that I will write separate Java class.  
	 * */
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is: " + browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		}	
		else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*
	 * Multiple threads lets say we are executing parallel execution, lets say 5 thread executing & 
	 * they all will be calling this getDriver method, So all the threads should be in sync, Due to that
	 * we are writing Synchronized keyword. 
	 * This is used to get the driver with ThreadLocal
	 * */

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	

}


