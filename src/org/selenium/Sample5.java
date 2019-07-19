package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get( " https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
	WebElement tw=d.findElement(By.name("vb_login_username"));
	tw.sendKeys("seetha");
	WebElement tw2=d.findElement(By.name("vb_login_password"));
	tw2.sendKeys("yamini123");
	WebElement e=d.findElement(By.xpath("(//input[@type='submit'])[1]"));
	e.click();

}
}
