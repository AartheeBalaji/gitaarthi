package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.manage().window().maximize();
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a= new Actions(driver);
		a.moveToElement(sports);
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		btn.click();
	}

}
