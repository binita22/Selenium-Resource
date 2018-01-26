package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TestFacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//textfield
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Test Selenium");
		//radio
		driver.findElement(By.xpath(".//*[@id='u_0_g']")).click();
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByIndex(4);
		
		//button
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		
	}

}
