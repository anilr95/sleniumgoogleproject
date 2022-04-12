package com.cg.googleautomation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	
	WebDriver driver;
	WebElement search;
	
	public GoogleAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public void pageTitle()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	}
	
	public void searchText()
	{
		search=driver.findElement(By.name("q"));
		search.sendKeys("capgemini india");
		search.submit();
		
	}
	
	public void findAnchors()
	{
		List<WebElement> list=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next().getText());	
		}
	}

}
