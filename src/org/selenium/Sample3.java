package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "https://www.cleartrip.com/trains");
		WebElement tw=d.findElement(By.name("from_station"));
		tw.sendKeys("hyd");
		WebElement tw2=d.findElement(By.name("to_station"));
		tw2.sendKeys("vijayawada");
		WebElement tw3=d.findElement(By.xpath("//select[@id='trainClass']"));
		tw3.sendKeys("3A");
		WebElement tw4=d.findElement(By.name("from_station"));
		tw4.sendKeys("hyd");
		WebElement tw5=d.findElement(By.name("from_station"));
		tw5.sendKeys("hyd");


}
}
