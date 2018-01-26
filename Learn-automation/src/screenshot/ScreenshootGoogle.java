package screenshot;

import java.io.File;
 
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;

import library.Utility;
 
public class ScreenshootGoogle {
 
 @Test
 public void TestJavaS1()
{
// Open Firefox
 WebDriver driver=new FirefoxDriver();
 
// Maximize the window
driver.manage().window().maximize();
// Pass the url
driver.get("https://www.facebook.com/");
Utility.captureScreenshot(driver,"BrowserStarted and maximized");
driver.findElement(By.id("email")).sendKeys("binita.ruwali"); 

// Take screenshot and store as a file format
//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// // now copy the  screenshot to desired location using copyFile //method
//FileUtils.copyFile(src, new File("./screenshot/error.png"));
//System.out.println("Screenshot captured");

Utility.captureScreenshot(driver, "Email entered");

}
 }