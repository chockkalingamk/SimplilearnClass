package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	WebDriver webObj = null;
	SoftAssert assetObj = null;

	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

//		System.setProperty("webdriver.gecko.driver", "F:\\downloads\\geckodriver.exe");
		
		webObj = new ChromeDriver();

		//WebDriver webObj = new FirefoxDriver();
		
		webObj.get("https://www.simplilearn.com/");

		webObj.manage().window().maximize();
		
		webObj.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}
	
	@Parameters({"UserName","Password"})

	@Test
	public void TestCase1(String Username, String Password) {
		WebElement lnkLogin = webObj.findElement(By.linkText("Log in"));

		lnkLogin.click();

		WebElement usrLogin = webObj.findElement(By.name("user_login"));

		usrLogin.sendKeys(Username);

		WebElement passLogin = webObj.findElement(By.name("user_pwd"));

		passLogin.sendKeys(Password);

		WebElement button = webObj.findElement(By.name("btn_login"));

		button.click();
		
		WebElement msgBox = webObj.findElement(By.id("msg_box"));
		
		String actMsg  = msgBox.getText();
		String expMsg = "The email or password you have entered";
		
		/*
		 * if(actMsg.equals(expMsg)) { System.out.println("TC passed"); }else {
		 * System.out.println("TC Not Passed"); }
		 */
		
		//Assert.assertEquals(actMsg, expMsg);
		
		assetObj = new SoftAssert();
		
		assetObj.assertEquals(actMsg, expMsg);
		
		
		
		System.out.println("After Assertion");

	}
	
	@AfterMethod
	public void afterTest() {
		assetObj.assertAll();
		webObj.quit();
	}
	
}
