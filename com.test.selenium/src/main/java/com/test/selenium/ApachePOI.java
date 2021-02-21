package com.test.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApachePOI {
	WebDriver webObj = null;
	SoftAssert assetObj = new SoftAssert();

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
	
	

	@Test
	public void TestCase1() {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("excel.xlsx");
		
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet she =  wb.getSheet("data");
		
		String userName = she.getRow(0).getCell(0).getStringCellValue();
		
		String password = she.getRow(1).getCell(1).getStringCellValue();
		
		
		
		WebElement lnkLogin = webObj.findElement(By.linkText("Log in"));

		lnkLogin.click();

		WebElement usrLogin = webObj.findElement(By.name("user_login"));

		usrLogin.sendKeys(userName);

		WebElement passLogin = webObj.findElement(By.name("user_pwd"));

		passLogin.sendKeys(password);

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
		
		
		
		assetObj.assertEquals(actMsg, expMsg);
		
		
		
		System.out.println("After Assertion");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@AfterMethod
	public void afterTest() {
		assetObj.assertAll();
		webObj.quit();
	}


}
