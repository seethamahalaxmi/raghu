package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main( String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\GitTest\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement w = d.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		w.sendKeys("iphones 7 pro");
		WebElement E = d.findElement(By.className("searchTextSpan"));
		E.click();
		WebElement w1=d.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black']"));
		w1.click();
		WebElement w2 = d.findElement(By.xpath("(//p[@class='product-title '])[13]"));
		w2.click();
		String s = d.getWindowHandle();
		Set<String> s2 = d.getWindowHandles();
		for(String x:s2)
		{
			if(!x.equals(s))
			{
				d.switchTo().window(x);
			}
		}
		
		WebElement M = d.findElement(By.id("add-cart-button-id"));
		M.click();
		
		
	}

}
