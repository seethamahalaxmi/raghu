package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day114 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> w = ty.findElements(By.tagName("tr"));
		for(int i=4;i<w.size();i++)
		{
			System.out.println(w.get(i).getText());

}

}

}
