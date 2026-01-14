package Episode19;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Snaps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		//Whole page Screenshots
		File source = driver.getScreenshotAs(OutputType.FILE);
		File loc = new File("./Snaps/img.png");
		FileHandler.copy(source, loc);
		// Button screenshot
	    WebElement ele = driver.findElementById("home");
	    File source1 = ele.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Snaps/img1.png");
	    FileHandler.copy(source1, dest);
	    // Particular section
	    WebElement element = driver.findElementByClassName("card-content");
	    File scr = element.getScreenshotAs(OutputType.FILE);
	    File dst = new File("./Snaps/img2.png");
	    FileHandler.copy(scr, dst);
	    
	    driver.quit();
	}

}
