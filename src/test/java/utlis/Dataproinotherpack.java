package utlis;

import org.testng.annotations.DataProvider;

public class Dataproinotherpack {
	@DataProvider(name = "Login", indices = {0, 1, 2}, parallel = true) //indices is use to execute the particular data {1,2}
	public String[][] GetData() {
		String[][] data = new String[3][2]; //rows and column count
		//row 1
		data[0][0] = "mor_2314";
		data[0][1] = "83r5^_";
		
		data[1][0] = "mor_1111";
		data[1][1] = "83r5^_";
		
		data[2][0] = "mor_1111";
		data[2][1] = "83r5^_";
		
		return data;
		
	}
	

}
