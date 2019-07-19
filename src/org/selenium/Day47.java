package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day47 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "https://www.facebook.com/ ");
		WebElement p = d.findElement(By.xpath("//input[@id='email']"));
		p.sendKeys("mahalaxmi@gmail.com");
String s = p.getAttribute("value");
System.out.println(s);
WebElement b = d.findElement(By.xpath("(//input[@type='password'])[1]"));
b.sendKeys("123456");
String s2 = b.getAttribute("value");
System.out.println(s2);
}

}
