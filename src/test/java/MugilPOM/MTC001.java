package MugilPOM;

//import org.POMseleniumbase.MBasecode;

//import org.testing.MLogin;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MTC001 extends MBasecode{
	
	@Test
	public void LoginTest() {
	
		MLogin lp = new MLogin();
		boolean validate = lp.createacc();
		Assert.assertEquals(validate, true);
		
		
		lp.enterUserName("mugil");
		lp.enterPassword("Pass");
		lp.clicklogin();
		
	}

}
