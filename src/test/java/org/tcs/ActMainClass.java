package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActMainClass extends ActBaseClass {
	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("http://greenstech.in/selenium-course-content.html");
		WebElement btnCourse = driver.findElement(By.xpath("//a[@href='courses.html']"));
		moveToCourse(btnCourse);
		WebElement btnOracle = driver.findElement(By.xpath("//a[@href='http://www.greenstech.in/oracle-training.html']"));
		moveToOracle(btnOracle);
		
		
	}

}
