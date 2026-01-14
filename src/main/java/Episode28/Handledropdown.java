package Episode28;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		// Select only one option
		WebElement dropdown =driver.findElementById("fruits");
		//WebElement dropdown = driver.findElementByCssSelector("#fruits");
		Select myfruit = new Select(dropdown);
		myfruit.selectByVisibleText("Apple");
		myfruit.selectByVisibleText("Pine Apple");
		List<WebElement> allfruits = myfruit.getOptions();
		//allfriuts.forEach(i -> system.out.println(i.getOption()));
		allfruits.forEach(i -> System.out.println(i.getText()));
		// Only one select from the option
		WebElement country =driver.findElementById("country");
		Select mycountry = new Select(country);
		mycountry.selectByValue("India");
		WebElement type = mycountry.getFirstSelectedOption();
		System.out.println(type.getText());
		// Multi select from the option
		WebElement multi = driver.findElementById("superheros");
		Select heros = new Select(multi);
		boolean value = heros.isMultiple();
		System.out.println(value);
		heros.selectByVisibleText("Aquaman");
		heros.selectByValue("ta");
		heros.selectByIndex(0);
		List<WebElement> helo = heros.getAllSelectedOptions();
		helo.forEach(i -> System.out.println(i.getText()));
		//Deselect
		heros.deselectByVisibleText("Aquaman");
		
		
	}

}
