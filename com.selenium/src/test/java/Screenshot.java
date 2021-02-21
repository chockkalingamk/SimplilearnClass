import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver",
		// "F:\\downloads\\geckodriver.exe");

		WebDriver webObj = new ChromeDriver();

		// WebDriver webObj = new FirefoxDriver();

		webObj.get("http://demo.guru99.com/test/delete_customer.php");

		webObj.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) webObj;
		File scr = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scr, new File("test1.png"));

	}

}
