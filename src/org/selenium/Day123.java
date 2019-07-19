package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day123 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://toolsqa.com/");
		WebElement w = ty.findElement(By.xpath("//div[@class='share-link-description']"));
		WebElement w2 = ty.findElement(By.xpath("//img[@class='preload-me lazyloading']"));
		JavascriptExecutor j=(JavascriptExecutor) ty;
		j.executeScript("arguments[0].scrollIntoView(true)",w);
		Thread.sleep(2000);
		j.executeScript("arguments[0].scrollIntoView(false)",w2);
		
}

}
