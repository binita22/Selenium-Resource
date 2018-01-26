package dropdownDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFacebookDropdown3 {
@Test
public void SelectedValues() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//actual length
	WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='month']"));
	Select month_dd = new Select(month_dropdown);
	List<WebElement> month_list = month_dd.getOptions();
	int totalMonth = month_list.size();
	
	//Assert.assertEquals(totalMonth, 13);
	System.out.println("Total month count is:" + totalMonth);
	//actual values
	for(WebElement ele: month_list){
		String value = ele.getText();
		System.out.println("Months are:::" + value);
	}
	//expected list of values
	String [] expectedMonthList = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"}; 		
	for(String eml: expectedMonthList){
		System.out.println("Expected Month are::"+ eml);
	}

	//get expected list of values and store on the array list
	ArrayList<String> eml = new ArrayList<String>();
	eml.add("Month");
	eml.add("Jan");
	eml.add("Feb");
	eml.add("Mar");
	eml.add("Apr");
	eml.add("May");
	eml.add("Jun");
	eml.add("Jul");
	eml.add("Aug");
	eml.add("Sep");
	eml.add("Oct");
	eml.add("Nov");
	eml.add("Dec");
	System.out.println("a"+ eml);
	Assert.assertEquals(month_list, eml);



	
}

}
