package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day112 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://toolsqa.com/automation-practice-table/");
		WebElement w = ty.findElement(By.xpath("//td[text()='4']"));
		System.out.println("rank of china is");
		
		
			System.out.println(w.getText());



}

}
