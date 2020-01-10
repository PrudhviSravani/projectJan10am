package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\BaseClassCreation\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e , String Value) {
	e.sendKeys(Value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void getTitle() {
		String text = driver.getTitle();
		System.out.println(text);

	}
	public static void getCurrentUrl() {
     String CurrentUrl = driver.getCurrentUrl();
     System.out.println(CurrentUrl);
     
		}

	
		

	}

	
