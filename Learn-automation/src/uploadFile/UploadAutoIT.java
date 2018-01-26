package uploadFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadAutoIT {
WebDriver driver = new FirefoxDriver();
@Test
public void testJenkins() throws InterruptedException, IOException{
	driver.manage().window().maximize();
	driver.get("file:///F:/testingTools/seleniumPractice/fileUpload.html");
	driver.findElement(By.xpath(".//input[@id='1']")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("F:\\testingTools\\seleniumPractice\\AutoIt\\FileUpload.exe");
	
	
}

}
