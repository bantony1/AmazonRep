package com.amazon.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Helper.BrowserFactory;
import com.amazon.Pages.HomePage;
import com.amazon.Pages.SearchResult;


public class HomePageTest {
	
	@Test
	public void placeOrder(){
		WebDriver driver = BrowserFactory.startBrowser("Firefox", "http://www.amazon.com");
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.searchItem("Jump Starter"); // no selection of 
		SearchResult searchResult = PageFactory.initElements(driver, SearchResult.class);
		Assert.assertTrue(searchResult.validateSearchPage("Jump Starter"));
		searchResult.clickProduct("Schumacher PSJ-4424 DSR ProSeries 4400");
		BrowserFactory.quitBrowser();
	}
}
