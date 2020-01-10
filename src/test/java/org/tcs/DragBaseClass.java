package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragBaseClass {
static WebDriver driver;


	
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//public static void source(WebElement e) {
		 
	//}
	//public static void destination(WebElement e1) {
	
//	}
	public static void draganddrop(WebElement source, WebElement destination) {
		 Actions acc= new Actions(driver);
	 acc.dragAndDrop(source, destination).perform();
		

	}
	

}
