package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day211 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://www.irctc.co.in/");
		WebElement w=ty.findElement(By.xpath("(//input[@type='text'])[1]"));
		w.sendKeys("hyderabad");
		WebElement s=ty.findElement(By.xpath("(//input[@type='text'])[2]"));
	s.sendKeys("vizag");
	}

}
