package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	WebElement tabledata = driver.findElement(By.id("customers"));
    List<WebElement>rows = tabledata.findElements(By.tagName("tr"));
    for (int i = 0; i < rows.size(); i++) {
    WebElement element = rows.get(i);
    String text = element.getText();
    if(text.equals("Mexico")) {
    System.out.println(text);
    }
		
	}
	}
    }

 	
	
		
    

    
    
	


