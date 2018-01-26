package handle.bootstrap.modal.window;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleModalWindow {
public static void main(String []args){
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/11/handle-bootstrap-model-dialog-in.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text() = 'Click here to Login']")).click();
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.xpath("")).sendKeys("");
}
	

}
