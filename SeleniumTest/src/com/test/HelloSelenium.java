package com.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String args[]) {

		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		WebDriver webObj = new ChromeDriver();

		webObj.get("https://www.simplilearn.com/");

		webObj.manage().window().maximize();

		WebElement lnkLogin = webObj.findElement(By.linkText("Log in"));

		lnkLogin.click();

		WebElement usrLogin = webObj.findElement(By.name("user_login"));

		usrLogin.sendKeys("test@rediffmail.com");

		WebElement passLogin = webObj.findElement(By.name("user_pwd"));

		passLogin.sendKeys("test");

		WebElement button = webObj.findElement(By.name("btn_login"));

		button.click();
		
		WebElement msgBox = webObj.findElement(By.id("msg_box"));
		
		String actMsg  = msgBox.getText();
		String expMsg = "The email or password you have entered is invalid.";
		
		if(actMsg.equals(expMsg)) {
			System.out.println("TC passed");
		}else
		{
			System.out.println("TC Not Passed");
		}

		webObj.quit();
		

	}
}
