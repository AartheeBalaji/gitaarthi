package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Aarthi')",user);
		
		WebElement pass = driver.findElement(By.id("pass"));
        js.executeScript("arguments[0].setAttribute('value','Balaji')",pass);
}
}
