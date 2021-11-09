package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scrollupanddown
		WebElement element = driver.findElement(By.xpath("//h2[text()='Upcoming Batches - Manual and Automation Testing LIVE Schedule:']"));
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Selenium Testing course Content']"));
		js.executeScript("arguments[0].scrollIntoView(false)",element2);

}
}
