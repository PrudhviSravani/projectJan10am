package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RobotMainClass extends RobotBaseClass {
	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");
		WebElement a =driver.findElement(By.id("email"));
		full(a, "b.sravani@gmail.com");
		WebElement b =driver.findElement(By.id("pass"));
		full(b, "13456");
		Click(a,b);
		WebElement c = driver.findElement(By.id("loginbutton"));
		login(c);
		
		
	}

}
