package HomeWork3;

public class Mobile {
	public void name(String name) {
		System.out.println("name is" + name );
		
	}
	public void name(int phonenumber) { 
		System.out.println("Phone number is" + phonenumber);

	}
	public double bmi() {
		double height = 162;
		double weight = 67;
		double cal = height / weight;
		//System.out.println("BMI is" + cal);
		return cal;
	}

}
