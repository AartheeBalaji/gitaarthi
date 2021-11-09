package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		switchto.click();
		WebElement firstalert = driver.findElement(By.xpath("//a[text()='Alerts']"));
		firstalert.click();
		WebElement secondalert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		secondalert.click();
		Thread.sleep(3000);
		Alert al =driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		WebElement thirdalert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		thirdalert.click();
		WebElement fouralert = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		fouralert.click();
		Thread.sleep(3000);
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(3000);
		al1.dismiss();
		WebElement fivealert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		fivealert.click();
		WebElement sixalert = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		sixalert.click();
		Thread.sleep(3000);
		Alert al2 =driver.switchTo().alert();
		Thread.sleep(3000);
		al2.dismiss();
		
		
		
}
}