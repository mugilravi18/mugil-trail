package Episode35;

public interface RBI {
	//IN interface the function will not have body so will create class to access. 
	int UPILimit =5000;
	
	void aadharMandatory();
	
	boolean panMandatory(boolean e);
	
	//in new version of java
	default void houseloan() {
		/*
		 * int a = 0; int b = 1; int add = a+b;
		 */
	 System.out.println("house loan");
	 
	}
	static void bikeloan() {
		System.out.println("bike loan");
	}

	boolean panMandatory();

}

