package com.AppTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	 static WebDriver driver;
	@Test
	public void SampleTest() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.get("https://www.flipkart.com/");
	}
}
