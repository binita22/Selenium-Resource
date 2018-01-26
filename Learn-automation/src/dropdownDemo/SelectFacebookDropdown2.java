package dropdownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown2 {
@Test
public void SelectedValues() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='month']"));
	Select month_dd = new Select(month_dropdown);
	//before selection it would return month
	WebElement selectedValue = month_dd.getFirstSelectedOption();
	System.out.println("Before Selection, selected value is:" + selectedValue.getText());
	//after selection, it will select april
	month_dd.selectByIndex(3);
	WebElement selectedValue1 = month_dd.getFirstSelectedOption();
	System.out.println("After Selection, selected value is:" + selectedValue1.getText());
	
	
	
}

}
