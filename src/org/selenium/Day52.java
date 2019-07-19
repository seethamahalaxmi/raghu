package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day52 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get(" http://www.amazon.iN");
	
		WebElement w = ty.findElement(By.xpath("(//span[@class='nav-line-2'])[6]"));
		Actions acc=new Actions(ty);
		acc.moveToElement(w).perform();
		
		WebElement w2 = ty.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		acc.moveToElement(w2).perform();
		Thread.sleep(3000);
	
		WebElement c = ty.findElement(By.xpath("//span[text()='Power Banks']"));
		c.click();
		
		
		
		
		
		
	}

}
