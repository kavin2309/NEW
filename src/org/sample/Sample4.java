package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saran\\eclipse-workspace\\Selenium(Day11)\\drivers\\geckodriver.exe");
		
		WebDriver drives = new FirefoxDriver();
		
		drives.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = drives.findElement(By.xpath("//table[@border='l']"));
		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		//shell===1
		
		WebElement row1 = allrows.get(allrows.size()-2);
		
		List<WebElement> data1 = row1.findElements(By.tagName("td"));
		
		WebElement data2 = data1.get(data1.size()-2);
		
		System.out.println(data2.getText());
		
		//shell===2
		
		WebElement row2 = allrows.get(allrows.size()-2);
				
		List<WebElement> data3 = row2.findElements(By.tagName("td"));

		WebElement data4 = data3.get(data3.size() - 1);

		System.out.println(data4.getText());

		// shell===3

		WebElement row3 = allrows.get(allrows.size() - 1);

		List<WebElement> data5 = row3.findElements(By.tagName("td"));

		WebElement data6 = data5.get(data5.size() - 2);

		System.out.println(data6.getText());

		// shell===4

		WebElement row4 = allrows.get(allrows.size() - 1);

		List<WebElement> data7 = row4.findElements(By.tagName("td"));

		WebElement data8 = data7.get(data7.size() - 1);

		System.out.println(data8.getText());
		
	}

}
