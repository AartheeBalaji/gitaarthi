package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	    WebElement src = driver.findElement(By.xpath("//span[text()='Prime']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(src).perform();
	    Thread.sleep(3000);
	    WebElement fast = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	    fast.click();
	    
}
}
