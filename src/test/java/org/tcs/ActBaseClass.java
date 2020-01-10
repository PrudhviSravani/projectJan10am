package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActBaseClass {
	static WebDriver driver;
	
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void moveToCourse(WebElement e) {
		Actions a= new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void moveToOracle(WebElement e) {
		Actions a= new Actions(driver);
		
		a.moveToElement(e).perform();
		
		

	}
		

	
		

	}


