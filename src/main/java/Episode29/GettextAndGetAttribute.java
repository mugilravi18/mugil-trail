package Episode29;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		//get text
		WebElement header = driver.findElementByTagName("h1");
		String text = header.getText();
		System.out.println(text);
		//driver.quit();
		
		String alltext = driver.findElementByClassName("card-content").getText();
		System.out.println(alltext);
		//This is for Sign up text element
		//WebElement text3 =driver.findElementByLinkText("Sign up");
		//String world = text3.getText();
		//System.out.println(text3);
		
		//Get Attribute
		String attribute = driver.findElementById("join").getAttribute("value");
		System.out.println(attribute);
		
		String attri2 = driver.findElementById("getMe").getAttribute("value");
		System.out.println(attri2);
		
		WebElement attri3 = driver.findElementById("fullName");
		String attr = attri3 . getAttribute("placeholder");
		System.out.println(attr);
		

	}

}
