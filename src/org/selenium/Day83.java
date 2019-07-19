package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day83 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		
		WebDriver ty=new ChromeDriver();
		ty.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		ty.switchTo().frame("login_page");
		WebElement w=ty.findElement(By.xpath("//img[@style='margin-right:18px;']"));
		w.click();
		Thread.sleep(3000);
		Alert al=ty.switchTo().alert();
		al.accept();
		//String s=al.getText();
		
		//System.out.println(s);
		

}
}