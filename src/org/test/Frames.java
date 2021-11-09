package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("DUMMY1"));
		user.click();
		driver.switchTo().frame("Revamp_Banner_ID");
		WebElement mobile = driver.findElement(By.id("HDisplay1.Rb14.C2"));
		Thread.sleep(3000);
		mobile.sendKeys("Aarthi");
		
	}
}
