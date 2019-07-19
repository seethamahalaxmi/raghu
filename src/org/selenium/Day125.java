package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day125 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("https://www.facebook.com/");
		WebElement r = ty.findElement(By.id("email"));
		WebElement s = ty.findElement(By.id("pass"));
		WebElement e = ty.findElement(By.xpath("//label[@id='loginbutton']"));
         JavascriptExecutor j=(JavascriptExecutor)ty;
         j.executeScript("arguments[0].setAttribute('value','mahalaxmi@gmail.com')", r);
         j.executeScript("arguments[0].setAttribute('value','varshu')", s);
         j.executeScript("arguments[0].click()", e);
}
}