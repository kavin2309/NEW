package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saran\\eclipse-workspace\\Selenium(Day11)\\drivers\\geckodriver.exe");
		
		WebDriver drives = new FirefoxDriver();
		
		drives.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = drives.findElement(By.xpath("//table[@border='l']"));
		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		WebElement row1 = allrows.get(allrows.size()-1);
		
		List<WebElement> alldata = row1.findElements(By.tagName("td"));
		
		WebElement data1 = alldata.get(alldata.size()-1);
		
		System.out.println(data1.getText());
		
	}

}
