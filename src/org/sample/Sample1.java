package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saran\\eclipse-workspace\\Selenium(Day11)\\drivers\\geckodriver.exe");
		
		WebDriver drives = new FirefoxDriver();
		
		drives.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = drives.findElement(By.xpath("//table[@border='l']"));
		
		String text = table.getText();
		
		System.out.println(text);
		
	}

}
