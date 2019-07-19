package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day411 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "http://www.adactin.com/HotelApp/  ");
		WebElement p = d.findElement(By.xpath("//input[@type='text']"));
		p.sendKeys("raghu@gmail.com");
String s = p.getAttribute("value");
System.out.println(s);
WebElement b = d.findElement(By.xpath("//input[@type='password']"));
b.sendKeys("123456");
String s2 = b.getAttribute("value");
System.out.println(s2);
}

}
