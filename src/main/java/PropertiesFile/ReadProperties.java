package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		  Properties properties = new Properties(); 
		  properties.load(new FileInputStream("./PropertiesEnglish.properties")); 
		  String property = properties.getProperty("Welcome"); System.out.println(property);
		 
		/*
		 * Properties properties = new Properties(); properties.load(new
		 * FileInputStream("./Locators.properties")); ChromeDriver driver = new
		 * ChromeDriver(); driver.findElementByLinkText("log in").click();
		 * driver.findElementByName("Email").sendKeys("koushik350@gmail.com");
		 * driver.findElementByName("Password").sendKeys("Pass123$");
		 * driver.findElementByXPath("//button[.'Login']").click();
		 */		
	

	}

}
