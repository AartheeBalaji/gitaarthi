package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
        WebElement sign = driver.findElement(By.xpath("//div[@class='accountInner']"));
        Actions a = new Actions(driver);
        a.moveToElement(sign).perform();
        WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
        login.click();
        driver.switchTo().frame("loginIframe");
        WebElement user = driver.findElement(By.id("userName"));
        user.sendKeys("Aarthi");
	}
}
