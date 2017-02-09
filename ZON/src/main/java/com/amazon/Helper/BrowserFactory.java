package com.amazon.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browser, String url){
		if(browser.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("InternetExplorer")){
			System.out.println("IE");
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("Chrome");
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void quitBrowser(){
		driver.quit();
	}
}
