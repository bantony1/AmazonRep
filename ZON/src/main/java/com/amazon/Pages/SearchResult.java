package com.amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResult {
	
	WebDriver driver;
	
	public SearchResult(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//ul[@id='s-results-list-atf']//li[9]//div[3]/div/a/h2")
	@CacheLookup
	WebElement product;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='bcKwText']/span")
	@CacheLookup
	WebElement searchValue;
	
	public void clickProduct(String item){
		if((product.getText()).contains(item)){
			System.out.println("Product found");
			product.click();
		}
		else{
			System.out.println("Product not found");
		}
	}
	
	public boolean validateSearchPage(String value){
		if((searchValue.getText()).contains(value)){
			System.out.println("Result is successful");
			return true;
		}
		else{
			System.out.println("Result is failure");
			return false;
		}
	}
	
}
