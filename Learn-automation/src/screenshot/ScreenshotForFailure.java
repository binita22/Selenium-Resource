package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class ScreenshotForFailure {
	// Open Firefox

	WebDriver driver = new FirefoxDriver();
@Test
	public void captureScreenshot() {
		// Maximize the window
		driver.manage().window().maximize();
		// Pass the url
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("emaila")).sendKeys("binita.ruwali");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.captureScreenshot(driver, result.getName());
		}
		driver.quit();
	}
}
