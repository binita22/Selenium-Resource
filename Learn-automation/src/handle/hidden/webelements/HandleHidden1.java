package handle.hidden.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHidden1 {
	public static void main(String[]args){
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	//handle radio button with similar property
	List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	for(int i=0; i<radio.size();i++){
		WebElement local_radio=radio.get(i);
		String value = local_radio.getAttribute("value");
		System.out.println("Values from radio buttons are::::"+value);
		if(value.equalsIgnoreCase("RUBY")){
			local_radio.click();
		}
	
	}
	driver.quit();
	}
}
