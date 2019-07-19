package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium33 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement w=d.findElement(By.xpath("//input[@name='email']"));
	w.sendKeys("seetha@gmail.com");
	
	WebElement x=d.findElement(By.xpath("//input[@type='password']"));
	x.sendKeys("varshu");
	WebElement r=d.findElement(By.xpath("//input[@type='number']"));
	r.sendKeys("8056087666");
	WebElement t=d.findElement(By.xpath("(//input[@type='radio'])[2]"));
	t.click();
	WebElement u = d.findElement(By.xpath("//button[@class='register-register-button']"));
	u.click();
	}

}
