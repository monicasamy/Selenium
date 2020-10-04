package week1.day2;

public class Calculator {
	
	public int addition(int num1, int num2) {
		int sum = num1 +num2;
		//System.out.println(sum +"-" + "additionresult");
		return sum;
	}

	public int  subtraction(int num3, int num4) {
		int sub = num3 - num4;
		//System.out.println(sub +"-"+"subtractedresult");
		return sub;
	}
	public double multiplication(double num5, double num6) {
		double mul = num5 * num6;
		//System.out.println(mul +"-"+"multipliedresult");
		return mul;
	}
	public static void main(String[] args) {
		
		// Calling and displaying from methods
		
	Calculator M = new Calculator();
	M.addition(5,6);
	M.subtraction(10, 5);
	M.multiplication(7.57,8.88);
	
	// Return results to main
	
	int sum = M.addition(5,6);
	int sub = M.subtraction(10, 5);
	double mul = M.multiplication(7.5,8.8);
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mul);
	
	
	

	}

}
