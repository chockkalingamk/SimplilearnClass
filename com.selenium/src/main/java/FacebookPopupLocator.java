import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPopupLocator {

	public static void main(String[] args) {
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		//System.setProperty("webdriver.gecko.driver", "F:\\downloads\\geckodriver.exe");
		
		WebDriver webObj = new ChromeDriver();

		//WebDriver webObj = new FirefoxDriver();
		
		webObj.get("https://www.facebook.com/");

		webObj.manage().window().maximize();
		
		//WebElement lnkLogin = webObj.findElement(By.linkText("Resources"));
		
		/*
		 * WebElement lnkLogin = webObj.findElement(By.partialLinkText("Log in"));
		 * lnkLogin.click();
		 */
		
		WebElement usrLogin = webObj.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));

		usrLogin.click();

		WebElement month = webObj.findElement(By.xpath("//*[@name='birthday_month']"));

		
		Select  ddMonth = new Select(month);
		
		ddMonth.selectByValue("1");
		
		//ddMonth.selectByVisibleText("Jan");

		



	}

}
