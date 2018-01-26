package geckodriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\testingTools\\software\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Application title is:::" + "test test");
		driver.quit();
		
	}

}
