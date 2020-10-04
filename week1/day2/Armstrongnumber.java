package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
	
int input = 153;
int a;
int sum = 0;
int remainder;
int original;
original = input;

while (input>0)
{
	remainder = input%10;
	a = remainder* remainder * remainder;
	sum = sum + a ;
	input = input/10;
		
}
System.out.println(sum);
if (sum == original)
{
	System.out.println("Yes , it is an armstrong number");
}else {
	System.out.println("Not an armstrong number");}
	}

}
