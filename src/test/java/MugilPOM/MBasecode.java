package MugilPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class MBasecode {
	
	String URL = "https://www.facebook.com/";
	protected RemoteWebDriver driver = null;
	
	//To lunch website
	@BeforeMethod
	public void startapp() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}
	

}
