package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day210 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement w=ty.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		w.sendKeys("raghavendra");
		WebElement s=ty.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[2]"));
	s.sendKeys("varshuu123");
	}

}
