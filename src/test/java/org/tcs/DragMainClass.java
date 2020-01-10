package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DragMainClass extends DragBaseClass {
	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = driver.findElement(By.id("credit2"));
//		source(s);
		WebElement d = driver.findElement(By.id("bank"));
//		destination(d);
	
		draganddrop(s,d);
	}
	

}
