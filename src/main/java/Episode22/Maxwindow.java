package Episode22;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maxwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");

	}

}
