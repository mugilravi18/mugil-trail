package Episode08;

public class Learner {
	
	public Learner(int a) {
		this.a = a;
		
		/*
		 * this.a = 10; this.b = "Shanav";
		 */
		
	}
	public Learner(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	int a;
	String b;
	float c;
	double d;
	boolean e;
	char f;
	
	public void learnconst() {
		System.out.println(a + "\n"+ b +"\n" + c +"\n" + d +"\n"+ e +"\n"+ f);
	}
	
	

	public static void main(String[] args) {
		Learner shanav = new Learner(25,"Shanav");
		shanav.learnconst();
		Learner thiru = new Learner(123);
		thiru.learnconst();

	}

}
