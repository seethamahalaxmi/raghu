package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day74 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
		ty.get("http://www.greenstechnologys.com/");
		WebElement w = ty.findElement(By.xpath("//img[@itemprop='photo']"));
		JavascriptExecutor j=(JavascriptExecutor) ty;
		j.executeScript("arguments[0].scrollIntoView(true)",w);
		TakesScreenshot t=(TakesScreenshot)ty;
		File s=t.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\screen4.png");
		FileUtils.copyFile(s, d);

}
}
