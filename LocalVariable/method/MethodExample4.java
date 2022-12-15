package method;

public class MethodExample4 {
	static double SalaryCalculation(double bs) {
		double gs=0,ta=0,da=0,hra=0;
		ta=0.2*bs;
		da=0.9*bs;
		hra=0.15*bs;
		
		gs=ta+da+hra+bs;
		return gs;
    	 
    	 
     }
	
	public static void main(String[]args) {
	    
		System.out.println(SalaryCalculation(1000));
		
		
	}
}
