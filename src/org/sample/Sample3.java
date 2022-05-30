package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saran\\eclipse-workspace\\Selenium(Day11)\\drivers\\geckodriver.exe");
		
		WebDriver drives = new FirefoxDriver();
		
		drives.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = drives.findElement(By.xpath("//table[@border='l']"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		int size = rows.size();

		System.out.println(size);
		
		
		
	}
}
