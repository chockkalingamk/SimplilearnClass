import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLLocator {
	public static void main(String args[]) {
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver",
		// "F:\\downloads\\geckodriver.exe");

		WebDriver webObj = new ChromeDriver();

		// WebDriver webObj = new FirefoxDriver();

		webObj.get("https://www.w3schools.com/html/html_tables.asp");

		webObj.manage().window().maximize();

		// WebElement lnkLogin = webObj.findElement(By.linkText("Resources"));

		/*
		 * WebElement lnkLogin = webObj.findElement(By.partialLinkText("Log in"));
		 * lnkLogin.click();
		 */

		List col = webObj.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		System.out.println("No of cols are : " + col.size());
		//System.out.println(""+col.forEach(headers -> headers.toString()));
		List row = webObj.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));

		System.out.println("No of cols are : " + col.size());
		
		WebElement tableRow = webObj.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]"));
		String valueIneedRow = tableRow.getText();
		System.out.println("Table row value is "+valueIneedRow);

		// to get 3rd row's 2nd column data
		WebElement cellIneed = webObj.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
		
		  JavascriptExecutor js = (JavascriptExecutor) webObj;
	        //This will scroll the page Horizontally till the element is found        
	        js.executeScript("arguments[0].scrollIntoView();", cellIneed);


	}

}
