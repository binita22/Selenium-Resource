package dropdownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class NewDropdownBootstrap {
	@Test
	public void newMethod() {
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "F:\\testingTools\\software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> ddMenu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a "));
		for(int i=0; i<ddMenu.size(); i++){
			WebElement element = ddMenu.get(i);
			String innerhtml = element.getAttribute("innerHTML");
			System.out.println("Value for dropdown is:::" + innerhtml);
			if(innerhtml.contentEquals("JavaScript")){
				element.click();
				break;
			}
		}
		driver.quit();
	}

}
