package Episode16;

import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class inputs {

	public static void main(String[] args) {
		// lunch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://letcode.in/edit");
		
		// Enter the full name
		
		driver.findElementById("fullName").sendKeys("Mugilarasi Ravikumar");
		//Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" Person 1234",Keys.TAB);
		//What is inside the text box
		String MyValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(MyValue);
		//Clear the text
		driver.findElementById("clearMe").clear();
		
		//Confirm edit field is disabled
		boolean enable = driver.findElementById("noEdit").isEnabled();
		System.out.println(enable);
		//Confirm text is readonly
		
		String readonly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(readonly);
		
		//To close the browser
		//driver.quit();
		

	}

}
