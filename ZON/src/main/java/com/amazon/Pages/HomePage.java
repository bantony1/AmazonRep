package com.amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how=How.ID, using="twotabsearchtextbox")
	@CacheLookup
		private WebElement textBox;
	
	@FindBy(how=How.XPATH, using="//input[@class='nav-input' and @type = 'submit']")
	@CacheLookup
		private WebElement submit;
	
	public void searchItem(String item){
		textBox.sendKeys(item);
		submit.click();
	}
		
}
