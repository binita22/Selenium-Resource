package handle.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlert {
	@Test
	public void testAlert() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Open KSRTC website
		driver.get("http://www.ksrtc.in/site/");
		// Click on Search Availability Service but
		driver.findElement(By.xpath(".//*[@id='Table_3']/tbody/tr[1]/td[2]/div/a")).click();
		// Switch to alert window and capture the text and print
		String actualMsg = driver.switchTo().alert().getText();
		String expectedMsg = "asdf";
		Assert.assertEquals(actualMsg, expectedMsg);
		System.out.println(actualMsg);
		// Pause testcase for 5 second
		Thread.sleep(5000);
		// click on ok button
		driver.switchTo().alert().accept();
		// Close browser
		driver.quit();
	}

	public static void handleAlert(WebDriver ldriver) {
//to check if alert is present
		if (isAlertPresent(ldriver)) {

			Alert alert = ldriver.switchTo().alert();

			System.out.println(alert.getText());

			alert.accept();

		}

	}

	public static boolean isAlertPresent(WebDriver ldriver) {

		try {

			ldriver.switchTo().alert();

			return true;

		} catch (NoAlertPresentException ex) {

			return false;

		}

	}
}
