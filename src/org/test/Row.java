package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Row {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com/ ");
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		login.click();
		WebElement pro = driver.findElement(By.xpath("//div[text()='Thomson TVs']"));
		Actions a = new Actions(driver);
		a.contextClick(pro).perform();

}
}