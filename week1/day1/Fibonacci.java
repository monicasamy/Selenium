package week1.day1;

public class Fibonacci {
	
	public static void main(String[] args) {
		
int input= 8;
int a = 0;
int b = 1;
int sum;



		for(int i = 1 ; i <= input; i++) {
		
		System.out.println(a);
		sum = a +b;
		a = b;
		b = sum;
			
			}
		

	}
}




