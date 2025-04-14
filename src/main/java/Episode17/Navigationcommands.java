package Episode17;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);	
		Thread.sleep(3000);
		driver.findElementById("home").click();
		String currenturl1 = driver.getCurrentUrl();
		System.out.println(currenturl1);
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.navigate());
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://letcode.in/button");
		
		
		
	}

}
