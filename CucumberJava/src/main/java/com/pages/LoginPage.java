package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1. By Locators
	
	private By emailId = By.xpath(".//input[@name='username']");
	private By password = By.xpath(".//input[@name='password']");
	private By submit = By.xpath(".//button[@type='submit']");
	private By forgotPWDLink = By.linkText("Forgot your password?");
	
	
	//2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. page actions: Features(behavior) of the page the form of methods:
	//   - Page class should not have Assertions, Assertions should be in Test class only.
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExist() {
		return driver.findElement(forgotPWDLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(submit).clear();
	}
	
}
