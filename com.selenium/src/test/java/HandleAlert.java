import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver",
		// "F:\\downloads\\geckodriver.exe");

		WebDriver webObj = new ChromeDriver();

		// WebDriver webObj = new FirefoxDriver();

		webObj.get("http://demo.guru99.com/test/delete_customer.php");

		webObj.manage().window().maximize();
		
		webObj.findElement(By.name("cusid")).sendKeys("53920");                    
		webObj.findElement(By.name("submit")).submit();            
	                
	        // Switching to Alert        
	        Alert alert = webObj.switchTo().alert();        
	                
	        // Capturing alert message.    
	        String alertMessage= webObj.switchTo().alert().getText();        
	                
	        // Displaying alert message        
	        System.out.println(alertMessage);    
	        Thread.sleep(5000);
	                
	        // Accepting alert        
	        alert.accept();  

	}

}
