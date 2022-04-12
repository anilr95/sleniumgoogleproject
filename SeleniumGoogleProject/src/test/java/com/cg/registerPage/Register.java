package com.cg.registerPage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
WebDriver driver;

public Register()
{
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	driver=new ChromeDriver();
}

public void loadUrl()
{
	driver.get("https://www.demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
}

public void enterDetails()
  {
	}


public void radioCheck()
   {
	List<WebElement> radio=driver.findElements(By.name("radiooptions"));
	Iterator<WebElement> it=radio.iterator();
	while(it.hasNext())
	{
		WebElement temp=it.next();
		if(temp.getAttribute("value").equals("FeMale"))
			temp.click();
	}
	}


public void checkBoxCheck()
{
	List<WebElement> checkbox=driver.findElements(By.xpath(""));
	Iterator<WebElement> it=checkbox.iterator();
	while(it.hasNext())
	{
		WebElement temp=it.next();
		if(temp.getAttribute("value").equals("Cricket"))
			temp.click();
	}
	}

public void langCheck()
  {
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
  }

}
