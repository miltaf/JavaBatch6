package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class practice extends BaseClass{

	public static void main (String[] args) {
		
		setUp();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[@href='/watch/60022645?tctx=33%2C0%2C%2C%2C']")).click();
		
	}
}
