package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day126 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://www.adactin.com/HotelApp/");
		WebElement r = ty.findElement(By.id("username"));
		WebElement s = ty.findElement(By.id("password"));
		WebElement e = ty.findElement(By.xpath("//input[@name='login']"));
         JavascriptExecutor j=(JavascriptExecutor)ty;
         j.executeScript("arguments[0].setAttribute('value','mahalaxmi@gmail.com')", r);
         j.executeScript("arguments[0].setAttribute('value','varshu')", s);
         j.executeScript("arguments[0].click()", e);
}

}
