package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		 // This will open browser
		WebDriver driver=new FirefoxDriver();
		 
		 // This will maximize your browser
		driver.manage().window().maximize();
		 
		// Open Gmail account creation page
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		//create instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//identify the Weblement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		// now execute query which actually will scroll until that element is not appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		//extract the text and verify
		System.out.println(element.getText());
	}

}
