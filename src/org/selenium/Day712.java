package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day712 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "https://www.snapdeal.com/");
		WebElement w1 = d.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		w1.sendKeys("HP laptop");
		WebElement w2 =d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		w2.click();
		TakesScreenshot t=(TakesScreenshot)d;
		File s=t.getScreenshotAs(OutputType.FILE);
		File r=new File("E:\\screen3.png");
		FileUtils.copyFile(s,r );
		
		

}
}
