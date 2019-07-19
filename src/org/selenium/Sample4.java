package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get( "https://www.swiggy.com/");
	WebElement e=d.findElement(By.xpath("//a[@class='r2iyh']"));
	e.click();
	WebElement tw=d.findElement(By.name("mobile"));
	tw.sendKeys("9849134657");
	WebElement tw2=d.findElement(By.name("name"));
	tw2.sendKeys("seetha");
	WebElement tw3=d.findElement(By.name("email"));
	tw3.sendKeys("mahalaxmi.raghava@gmail.com");
	WebElement tw4=d.findElement(By.name("password"));
	tw4.sendKeys("yamini123");
	WebElement tw5=d.findElement(By.xpath("//a[@class='a-ayg']"));
	tw5.click();
	
	}
}
