package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get(" http://toolsqa.com/automation-practice-form/");
	WebElement w=d.findElement(By.name("firstname"));
	w.sendKeys("varanasi");
	
	WebElement x=d.findElement(By.xpath("//input[@name='lastname']"));
	x.sendKeys("seetha");
	WebElement r=d.findElement(By.xpath("(//input[@name='sex'])[2]"));
	r.sendKeys("*");
	WebElement t=d.findElement(By.xpath("(//input[@name='exp'])[3]"));
	t.sendKeys("*");
	}

}
