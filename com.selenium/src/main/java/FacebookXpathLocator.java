import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathLocator {

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
		
		WebElement usrLogin = webObj.findElement(By.cssSelector("input#email"));

		usrLogin.sendKeys("test@rediffmail.com");

		WebElement passLogin = webObj.findElement(By.cssSelector("input#pass"));

		passLogin.sendKeys("test");

		WebElement button = webObj.findElement(By.cssSelector("button[name=login]"));

		button.click();



	}

}
