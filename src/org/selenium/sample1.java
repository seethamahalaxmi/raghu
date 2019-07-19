package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\yamu\\Selenium\\Driver\\chromedriver.exe ");
		WebDriver ty=new ChromeDriver();
ty.get("  http://www.greenstechnologys.com/ ");
WebElement r=ty.findElement(By.xpath("//a[@href='contact.php']"));
r.click();
WebElement w=ty.findElement(By.name("name"));
w.sendKeys("mahalaxmi");
WebElement p= ty.findElement(By.xpath("(//input[@type='email'])[1]"));
p.sendKeys("mahalaxmi.raghava@gmail.com");

WebElement q= ty.findElement(By.xpath("(//input[@type='text'])[2]"));
q.sendKeys("8754480394");

WebElement m= ty.findElement(By.xpath("(//select[@name='courses'])[1]"));
m.sendKeys("selenium");

WebElement s= ty.findElement(By.xpath("(//select[@name='branch'])[1]"));
s.sendKeys("omr");
WebElement t= ty.findElement(By.name("time"));
t.sendKeys("10 am");
WebElement u= ty.findElement(By.name("comments"));
u.sendKeys("happy to join greens");

	}
}
 

