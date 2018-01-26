package handle.hidden.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHidden {
	public static void main(String[]args){
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> radio = driver.findElements(By.id("male"));
		int count = radio.size();
		System.out.println("Total radio buttons:::"+ count);
		for(int i=0; i<radio.size(); i++){
			int x = radio.get(i).getLocation().getX();
			if(x!=0){
				radio.get(i).click();
				break;				
			}
		}
	}
}
