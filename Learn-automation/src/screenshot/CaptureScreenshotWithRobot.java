package screenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshotWithRobot {

	public static void main(String[] args) throws Exception {
		// Open Firefox
		WebDriver driver = new FirefoxDriver();

		// Maximize the window
		driver.manage().window().maximize();
		// Pass the url
		driver.get("https://www.facebook.com/");
		// This code will capture screenshot of current screen
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File(
				"F:\\testingTools\\SeleniumAdvanced\\TutorialFiles\\JavaSeleniumWorkspace\\Learn-automation\\screenshot\\RobotCapture.png"));

	}

}