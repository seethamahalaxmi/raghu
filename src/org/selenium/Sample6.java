package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get( " https://www.snapdeal.com/");
	WebElement e=d.findElement(By.xpath("//div[@class=\"accountInner\"]"));
	e.click();
}
}
