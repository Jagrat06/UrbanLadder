package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_page {
	
	WebDriver driver;
	
	public Base_page(WebDriver driver) {
		
		this.driver=driver;

	}

	public void googlechrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ms.Sahoo\\Desktop\\cts_849050\\Firstseleniumproject\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.urbanladder.com/");
	    driver.manage().window().maximize();
	    
	    try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

