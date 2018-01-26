package uploadFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class HandleAuthenticationWindow {
public static void main(String[]args) throws IOException, InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.engprod-charter.net/");
	Runtime.getRuntime().exec("F:\\testingTools\\seleniumPractice\\AutoIt\\HandleAuthentication.exe");	
	Thread.sleep(5000);
	driver.close();
}



}
