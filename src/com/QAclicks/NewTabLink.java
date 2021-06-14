package com.QAclicks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\happy\\Desktop\\SeleniumPractice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlist=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerlist.findElements(By.tagName("a")).size());
		WebElement columndList=footerlist.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		for(int i=1;i<columndList.findElements(By.tagName("a")).size();i++) {
			
		String CLickingkey=	Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndList.findElements(By.tagName("a")).get(i).sendKeys(CLickingkey);
		}

	}

}
