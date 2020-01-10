package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotBaseClass {
	static WebDriver driver;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static  void full(WebElement e,String Value) {
	e.sendKeys(Value);
	
	}
	public static void Click(WebElement userId, WebElement password) {
		Actions acc = new Actions(driver);
		acc.doubleClick(userId).perform();
		acc.contextClick(password).perform();


	}
	public static  void login(WebElement e) {
	
		e.click();



	}

}
