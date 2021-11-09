package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement course1 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions a = new Actions(driver);
		a.moveToElement(course1).perform();
		WebElement course2 = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(course2).perform();
		WebElement open = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		open.click();
	}
}
