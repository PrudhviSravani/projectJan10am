package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass{
	public static void main(String[] args) {
		
	launchChromeBrowser();
	loadUrl("https://www.facebook.com/");
    getTitle();
	getCurrentUrl();
	WebElement userName = driver.findElement(By.id("email"));
	fill(userName, "b.sravani");
    WebElement password = driver.findElement(By.id("pass"));
    fill(password, "123456");
    WebElement login = driver.findElement(By.id("loginbutton"));
    btnClick(login);

}
}