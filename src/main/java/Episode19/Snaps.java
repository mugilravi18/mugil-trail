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
		
		File shot = driver.getScreenshotAs(OutputType.FILE);
		File loc = new File("./Snaps/img.png");
		FileHandler.copy(shot, loc);

	    WebElement ele = driver.findElementById("home");
	    File source = ele.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Snaps/img1.png");
	    FileHandler.copy(source, dest);
	    
	    WebElement element = driver.findElementByClassName("card-content");
	    File scr = element.getScreenshotAs(OutputType.FILE);
	    File dst = new File("./Snaps/img2.png");
	    FileHandler.copy(scr, dst);
	    
	    driver.quit();
	}

}
