package com.java.org;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Project_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multiple = driver.findElement(By.id("multi-select"));
		Select s= new Select(multiple);
		Boolean multiple2 = s.isMultiple();
		System.out.println("ismultiple:" +multiple2);
		//-----------------------------------------------------------------------------------------------
		
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
			
		}
		
		//-----------------------------------------------------------------------------------------------
       int size = options.size();
       System.out.println("Size of the option is:"+ size);
       //-----------------------------------------------------------------------------------------------
       
       for (int i=0 ; i<=size; i++)
       {
    	   if(i == 0 || i == 1 || i ==3 || i == 5)
    	   {
    		   s.selectByIndex(i);
    	   }
       }
       List<WebElement>allselectedoptions = s.getAllSelectedOptions();
       for (WebElement allselected : allselectedoptions) {
    	   System.out.println(allselected.getText());
       }
		/*
		 * System.out.println(
		 * "----------------------------------------------------------------------------------------------");
		 * WebElement firstselectedoptions = s.getFirstSelectedOption();
		 * System.out.println(firstselectedoptions.getText());
		 */
	}
       
}

       
       
       
    	  
    		   
		

