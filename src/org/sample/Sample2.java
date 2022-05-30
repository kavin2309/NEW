package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saran\\eclipse-workspace\\Selenium(Day11)\\drivers\\geckodriver.exe");
		
		WebDriver drives = new FirefoxDriver();
		
		drives.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = drives.findElement(By.xpath("//table[@border='l']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		WebElement row1 = rows.get(0);
		
		List<WebElement> datas = row1.findElements(By.tagName("td"));
		
		for (int i = 0; i < datas.size() ; i++) {
			
			WebElement data1 = datas.get(i);
			
			System.out.println(data1.getText());
			
		}
		
		
		
		
		
		
	}

}
