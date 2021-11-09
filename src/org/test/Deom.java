package org.test;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Deom {
	public static void main(String[] args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement Day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Day.click();
		Select a = new Select(Day);
		a.selectByIndex(15);
		List<WebElement> options = a.getOptions();
		int size = options.size();
        System.out.println(size);
        for (int i = 0; i <size; i++) {
        	WebElement Days = options.get(i);
        	String text = Days.getText();
        	System.out.println(text);
			Thread.sleep(300);
		}
	    
		}
		
	    
		
			
		}


