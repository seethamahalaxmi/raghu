package org.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day122 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://www.greenstechnologys.com/");
		WebElement w = ty.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		JavascriptExecutor j=(JavascriptExecutor) ty;
		j.executeScript("arguments[0].scrollIntoView(true)",w);
		System.out.println(w.getText());
		
		
}
}