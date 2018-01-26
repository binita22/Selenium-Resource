package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// This will open browser
		WebDriver driver = new FirefoxDriver();

		// This will maximize your browser
		driver.manage().window().maximize();

		// Open gmail account creation page
		driver.get(
				"https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");

		// Click on username textbox
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		// create action class object
		Actions builder = new Actions(driver);
		// find the tooltip xpath
		WebElement username_tooltip = driver.findElement(By.xpath("html/body/div[2]/div[1]"));

		// Mouse hover to that text message
		builder.moveToElement(username_tooltip).perform();

		// Extract text from tooltip
		String tooltip_msg = username_tooltip.getText();

		// Print the tooltip message just for our refrences
		System.out.println("Tooltip/ Help message is " + tooltip_msg);

	}

}
