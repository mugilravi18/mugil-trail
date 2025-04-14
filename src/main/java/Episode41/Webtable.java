package Episode41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		//to find the table
        WebElement table = driver.findElementById("simpletable");
        //To find all header values
        List<WebElement> hearder = table.findElements(By.tagName("th"));
        for (WebElement allhearders : hearder) {
        	// To get all hearder text
			String hearderprint = allhearders.getText();
			// To print
			System.out.println(hearderprint);
		}
        // To find the rows in the same table(above)
        	List<WebElement> test = table.findElements(By.cssSelector("tbody tr"));
        	//To find the Size
        	int size = test.size();
        	// To Print
        	System.out.println(size);
        	if (size == 3)
        	{
        		System.out.println("Pass");
        	} else System.out.println("Fail");
        	
        	//Scenario to get all and going to print any value based on index(test)
        	
			/*
			 * for (WebElement rows : test) { //Will get all row from above scenario
			 * List<WebElement> test2 = rows.findElements(By.cssSelector("td")); // To
			 * return the firstcolumn WebElement firstcolumn = test2.get(0); //To Print
			 * System.out.println(firstcolumn.getText()); }
			 */
        	
        // To find the value and enable the check box
        	for (int i = 0; i < size; i++) {
        		// To Find the column
        		List<WebElement> row = test.get(i).findElements(By.tagName("td"));
        		// To get the value in that index
        		WebElement lastname = row.get(1);
        		//To get as text
        		String Text =lastname.getText();
        		//To print
        		System.out.println(Text);
        		if (Text.equals("Chatterjee")) {
        			WebElement checkbox = row.get(3).findElement(By .tagName("input"));
        			checkbox.click();
        			break;
        		}
        		
        		
			}
	}

}
