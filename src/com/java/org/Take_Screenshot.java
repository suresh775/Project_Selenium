package com.java.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Project_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		//driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mr. suresh\\eclipse-workspace\\Project_Selenium\\Screenshots\\example1.jpeg");
		FileUtils.copyFile(source, destination);
		

	}

}
