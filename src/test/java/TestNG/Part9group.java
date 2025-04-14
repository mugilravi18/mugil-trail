package TestNG;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class Part9group {
	@Test(groups = "Smoke")
	public  void Signup() {
		System.out.println("sign up");

	}
	@Test(groups = "Sanity")
	public  void login() {
		System.out.println("login");

	}
	@Test(groups = "Reg")
	public  void Searchproduct() {
		System.out.println("Searchproduct");

	}

	@Test(groups = "Smoke") 
	public  void Addtocart() {
		System.out.println("Addtocart");
		throw new RuntimeErrorException(null); // Intentional failing this method so upcoming method got skipped

	}

	@Test(groups = "Reg")
	public  void Signout() {
		System.out.println("Signout");

	}

}
