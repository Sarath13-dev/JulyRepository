package org.login;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample  {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\May8AM\\Java\\Selenium.txt");
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
	}

}
