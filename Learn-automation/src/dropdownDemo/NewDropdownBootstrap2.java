package dropdownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class NewDropdownBootstrap2 {
	@Test
	public void newMethod() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> ddMenu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a "));
		System.out.println("asdf asdf:::"+ ddMenu);
		for(WebElement ele:ddMenu){
			String innerhtml = ele.getAttribute("innerHTML");
			if(innerhtml.contentEquals("JavaScript")){
				ele.click();
				break;
			}
			System.out.println("Dropdown values are::::"+ innerhtml);
		}
		driver.quit();
	}

}
