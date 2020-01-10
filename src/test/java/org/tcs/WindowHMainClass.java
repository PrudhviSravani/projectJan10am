package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowHMainClass extends WindowHBaseClass  {
	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("https://www.snapdeal.com/");
		WebElement searchBtn = driver.findElement(By.id("inputValEnter"));
		fill(searchBtn,"iphone 7 mobiles");
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnClick(searchIcon);
		WebElement phone = driver.findElement(By.xpath("//img[@src='https://n1.sdlcdn.com/imgs/i/x/l/230X258_sharpened/Redmi-7A-32GB-2-GB-SDL843714912-1-6c4e0.jpeg']"));
		selectPhone(phone);
		forMethod();
		
		
		

	}

}
