package org.test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	    WebElement firstclick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    firstclick.click();
	    Alert simple = driver.switchTo().alert();
	    simple.accept();
	    WebElement secclick = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    secclick.click();
	    WebElement sec2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    sec2.click();
	    Alert confirm = driver.switchTo().alert();
	    confirm.accept();
	    WebElement thirdclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	    thirdclick.click();
	    WebElement sec3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    sec3.click();
	    Alert prompt = driver.switchTo().alert();
	    prompt.accept();
	    
	    
	
			
		}
	}


			
	
	

