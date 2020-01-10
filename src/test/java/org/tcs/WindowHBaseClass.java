package org.tcs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHBaseClass {
	static WebDriver driver;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e,String value ) {
	e.sendKeys(value);

	}
	public static void btnClick(WebElement e) {
	e.click()	;
	}
	public static void selectPhone(WebElement e) {
	e.click();
		

	}
	public static void forMethod() {
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String x : all) {
			if(!par.equals(x));
			driver.switchTo().window(x);
			
		}
			
		}
			
		}

	
