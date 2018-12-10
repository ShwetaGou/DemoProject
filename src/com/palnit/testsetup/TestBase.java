package com.palnit.testsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.exe", "chromedriver.exe");
		//
		driver = new ChromeDriver();

	}

	@Test
	public void launchApplication() {
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
