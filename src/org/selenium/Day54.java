package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day54 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://www.gettyimages.in/");
		Thread.sleep(3000);
	
		WebElement w = ty.findElement(By.xpath("(//a[@target='_self'])[17]"));
		w.click();
		
	    Thread.sleep(3000);
		WebElement c = ty.findElement(By.xpath("(//a[@target='_self'])[23]"));
		c.click();
		
		
		
		
		
		
	}


}
