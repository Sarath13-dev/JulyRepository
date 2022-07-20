package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// Set the Property of Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumMay\\Driver\\chromedriver.exe");
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement tableData = driver.findElement(By.id("customers"));
		String text = tableData.getText();
		System.out.println(text);
		// getting all row values
//		List<WebElement> allRows = tableData.findElements(By.tagName("tr"));
//
//		// getting one by one row
//		for (int i = 0; i < allRows.size(); i++) {
//			// getting indivual ele
//			WebElement webElement = allRows.get(i);
//
//			List<WebElement> data = webElement.findElements(By.tagName("td"));
//			for (int j = 0; j < data.size(); j++) {
//				WebElement dat = data.get(j);
//				String text = dat.getText();
//				System.out.println(text);
//			}
//
//		}

	}

}
