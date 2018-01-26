package advanceActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRightClick {
@Test
public void TestClick() throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	act.contextClick(driver.findElement(By.linkText("English")));
}
}
