package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Result_page extends Home_page {

	public Result_page(WebDriver driver) {
		super(driver);
		
	}
	
	By category= By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]/div[1]");
	By choose=By.id("filters_storage_type_Open");
	By stock=By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/form/div[2]/div/input");
	
	public void categorydropdown() {
		driver.findElement(category).click();
	}
	
	public void categoryselect() {
		driver.findElement(choose).click();
	}
	
	public void outstock() {
		driver.findElement(stock).click();
	}

}
