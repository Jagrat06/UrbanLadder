package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page extends Base_page{

	public Home_page(WebDriver driver) {
		super(driver);
		
	}
	
	By Popup=By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	By searchbox= By.xpath("//span[@class='twitter-typeahead']/child::input[@id='search']");
	By searchbtn=By.xpath("//span[@class='search-icon icofont-search']/parent::button");
	
	
	public void blockPopup() {
		driver.findElement(Popup).click();
	}
	
	public void typesearch() {
		driver.findElement(searchbox).sendKeys("Book Shelf");
	}
	
	public void clicksearchbtn() {
		driver.findElement(searchbtn).click();
	}

}
