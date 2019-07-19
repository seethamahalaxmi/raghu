package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day51 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get(" http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(3000);
		WebElement w = ty.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		Actions acc=new Actions(ty);
		WebElement w2 = ty.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(w, w2).perform();
		Thread.sleep(3000);
		WebElement a = ty.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement b = ty.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(a,b).perform();
		Thread.sleep(3000);
		WebElement c = ty.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement d = ty.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(c,d).perform();
		Thread.sleep(3000);
		WebElement e = ty.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement f = ty.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(e,f).perform();
	
	
	
		
		
		
	}				

}
