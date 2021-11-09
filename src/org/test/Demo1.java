package org.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo1  {
	public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	Thread.sleep(300);
	WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
	country.click();
	Select a = new Select(country);
	a.selectByIndex(10);
	List<WebElement> options = a.getOptions();
	int size = options.size();
	System.out.println(size);
for (int i = 0; i < size; i++) {
	WebElement country1 = options.get(i);
	String text = country1.getText();
	System.out.println(text);
	Thread.sleep(300);
}
	
}

}
