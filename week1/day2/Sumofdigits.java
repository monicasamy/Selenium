package week1.day2;

public class Sumofdigits {

	public static void main(String[] args) {
		int input = 123;
		int sum = 0;
		int remainder;
	while (input>0)
	{
		remainder = input%10;
		sum = sum + remainder;
		input = input/10;		
	}
	System.out.println(sum);
	}

}
