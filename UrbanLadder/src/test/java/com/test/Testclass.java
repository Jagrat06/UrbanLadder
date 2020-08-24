package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.Base_page;
import com.pages.Home_page;
import com.pages.Result_page;


public class Testclass {
	public static WebDriver driver;
	
	/*@BeforeTest
	
	@Test( priority = 1,groups="smoke" )
	public void launch() {
		Base_page obj0=new Base_page(driver);
		obj0.googlechrome();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}*/
	
	@Test( priority = 1,groups="smoke" )
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ms.Sahoo\\Desktop\\cts_849050\\Firstseleniumproject\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.urbanladder.com/");
	    driver.manage().window().maximize();
	    
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test( priority = 2,groups="Regression" )
	public void block() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Home_page obj1=new Home_page(driver);
		obj1.blockPopup();
	}
	
	@Test( priority = 3,groups="Regression" )
	public void search() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Home_page obj2=new Home_page(driver);
		obj2.typesearch();
	}
	
	@Test( priority = 4,groups="Regression" )
	public void clickbtn() {
		
		Home_page obj3=new Home_page(driver);
		obj3.clicksearchbtn();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@Test( priority = 6,groups="Regression" )
	public void category_drop() {
		Result_page obj4=new Result_page(driver);
		obj4.categorydropdown();
		
		
	}
	@Test( priority = 7,groups="Regression" )
	public void chooseopen() {
		Result_page obj5=new Result_page(driver);
		obj5.categoryselect();
		
	}
	
	
	@Test( priority = 5,groups="Regression" )
	public void chooseoutstock() {
		Result_page obj5=new Result_page(driver);
		obj5.outstock();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test( priority = 8,groups="smoke" )
	public void quit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}


