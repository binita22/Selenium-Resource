package dropdownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown {
@Test
public void SelectedValues() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='month']"));
	Select month_dd = new Select(month_dropdown);
	//it will select april
	month_dd.selectByIndex(4);
	
	Thread.sleep(3000);
	month_dd.selectByValue("2");
	
	Thread.sleep(3000);
	month_dd.selectByVisibleText("Feb");
	
}

}
