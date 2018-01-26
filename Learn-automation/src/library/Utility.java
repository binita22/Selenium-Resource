package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Utility {
	public static void captureScreenshot(WebDriver driver, String screenshotName){
		try {			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/" + screenshotName+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}
		
	}

}
