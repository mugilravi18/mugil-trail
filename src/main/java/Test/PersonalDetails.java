package Test;

public class PersonalDetails {		
	public String PersonD() {
		String name = "Shanav";
		int age = 1;
		String DOB = "06/03/2024";
		Double weight = 69.0;
		System.out.println("Hi my name is" + name +"."+ "My age is" +age +"."+"My Date Of Birth is"+DOB+"."+ "My weight is"+ weight +"." );
		return "";
	}
	public double bmiIndex() {
		int height = 168;
		Double weight = 79.0;
		Double bmi = weight/(height*height);
		return bmi;
		
	}
}


