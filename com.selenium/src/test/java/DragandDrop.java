import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver",
		// "F:\\downloads\\geckodriver.exe");

		WebDriver webObj = new ChromeDriver();

		// WebDriver webObj = new FirefoxDriver();

		webObj.get("http://demo.guru99.com/test/drag_drop.html");

		webObj.manage().window().maximize();

		// WebElement lnkLogin = webObj.findElement(By.linkText("Resources"));

		/*
		 * WebElement lnkLogin = webObj.findElement(By.partialLinkText("Log in"));
		 * lnkLogin.click();
		 */

	
		//Element which needs to drag.            
        WebElement From=webObj.findElement(By.xpath("//*[@id='credit2']/a"));    
     
         //Element on which need to drop.        
         WebElement To=webObj.findElement(By.xpath("//*[@id='bank']/li"));  
         
         Actions actObj = new Actions(webObj);
         
         actObj.dragAndDrop(From, To).build().perform();



	}

}
