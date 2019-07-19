package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://twitter.com/login");
		WebElement w=ty.findElement(By.xpath("(//input[@type='text'])[2]"));
		w.sendKeys("mahalaxmi");
		WebElement s=ty.findElement(By.xpath("(//input[@type='password'])[2]"));
	s.sendKeys("yamu123");
	}

}
