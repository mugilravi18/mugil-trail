package Test2;

public class LocalVariable {
	int c;
	
	public void num(int a, int b) {
	 int c = 10 ;
		System.out.println(a+b+this.c);
		
	}
	
	public static void main(String[] args) {
		LocalVariable abcd = new LocalVariable();
		abcd.num(5, 10);
		
	}
	

}
