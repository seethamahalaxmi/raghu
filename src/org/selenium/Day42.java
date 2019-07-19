package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day42 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "http://www.greenstechnologys.com/testimonial.html ");
		WebElement p = d.findElement(By.xpath("//div[@id='article-wrapper']"));
String s = p.getText();
System.out.println(s);
}

}
