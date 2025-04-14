package TestNG;

//import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Part7enable {
	@Test(enabled = false,alwaysRun = true)//enable = false is used to disable the function 
		public void signup() {
			System.out.println("sign up");
		}
	@Test(description = "This is for login")
	public  void login() {
		System.out.println("login");
		
	}
	
}
