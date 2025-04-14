package ChromBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LunchChrom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// load the URL
		
		driver.get("https://www.instagram.com/");
		
		//For Screenshot
		File shot = driver.getScreenshotAs(OutputType.FILE);
		File loc = new File("./Snaps/img11.png");
		FileHandler.copy(shot, loc);
		
		WebElement Ele = driver.findElementByName("username");
		File Source = Ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img12.png");
		FileHandler.copy(Source, dest);
		
		
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//FirefoxDriver firefoxDriver = new FirefoxDriver();
		
	
		
		
	}

}
