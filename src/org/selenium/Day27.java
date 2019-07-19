package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day27 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://netbanking.hdfcbank.com/");
		ty.switchTo().frame("login_page");
		WebElement w=ty.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		w.sendKeys("mahalaxmi@gmail.com");
		//ty.switchTo().defaultContent();

}
}
