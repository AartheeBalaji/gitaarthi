package org.test;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raw {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Robot r = new Robot();
		
	     r.keyPress(KeyEvent.VK_A);
	     r.keyRelease(KeyEvent.VK_A);
	     r.keyPress(KeyEvent.VK_A);
	     r.keyRelease(KeyEvent.VK_A);
	     r.keyPress(KeyEvent.VK_R);
	     r.keyRelease(KeyEvent.VK_R);
	     r.keyPress(KeyEvent.VK_T);
	     r.keyRelease(KeyEvent.VK_T);
	     r.keyPress(KeyEvent.VK_H);
	     r.keyRelease(KeyEvent.VK_H);
	     r.keyPress(KeyEvent.VK_I);
	     r.keyRelease(KeyEvent.VK_I);
	     WebElement email = driver.findElement(By.id("email"));
	     r.keyPress(KeyEvent.VK_CUT);
	     r.keyPress(KeyEvent.VK_TAB);
	     r.keyRelease(KeyEvent.VK_TAB);
	     r.keyPress(KeyEvent.VK_PASTE);
}
}
		
		


