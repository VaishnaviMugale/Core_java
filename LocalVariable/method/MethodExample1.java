package method;

public class MethodExample1 {
	static void m1() {
    	 System.out.println("This is method with no return type");
    	 
     }
	static int m2() {
		System.out.println("This is method with return type");
		return 10;
	}
	public static void main(String[]args) {
		m1();
		
		int x = m2();
		System.out.println(x);
	}
}
