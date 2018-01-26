package disable.chrome.notification;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopup {

	public static void main(String[] args)throws Exception {
		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
		//set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notification", 2);
		//Create Object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
		//set the experimental option
		options.setExperimentalOption("prefs", prefs);
		//pass the options object in chrome driver
		//System. setProperty("webdriver.chrome.driver","F:/testingTools/software/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("urid");
		driver.findElement(By.id("pass")).sendKeys("urpass");
		driver.findElement(By.id("loginbutton")).click();
		
		

	}

}
