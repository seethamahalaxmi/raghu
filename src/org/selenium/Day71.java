package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day71 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get( "http://www.greenstechnologys.com/");
		TakesScreenshot t=(TakesScreenshot)d;
		File s=t.getScreenshotAs(OutputType.FILE);
		File e=new File("E:\\screen2.png");
		FileUtils.copyFile(s,e);
		
		

}
}
