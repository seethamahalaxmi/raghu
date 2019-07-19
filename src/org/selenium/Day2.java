package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		
		WebDriver ty=new ChromeDriver();
		ty.get(" https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		Thread.sleep(3000);
		WebElement w=ty.findElement(By.xpath("//input[@name='username']"));
		w.sendKeys("mahalaxmi");
		
		WebElement s=ty.findElement(By.xpath("//input[@name='password']"));
	    s.sendKeys("yamu123");
	}

}
