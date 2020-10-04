package week3.day1;

public class Calculator {
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	public void add(int a , int b , int c)
	{
		System.out.println(a+b+c);
	}
	public void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	public void sub(double d , double e)
	{
		System.out.println(d-e);
	}
	public void mul(int a, int b)
	{
	System.out.println(a*b);	
	}
	public void mul(int a , double f)
	{
		System.out.println(a*f);
	}
	public void divide(int a , int b)
	{
		System.out.println(a/b);
	}
	public void divide(double f , int a) 
	{
		System.out.println(f/a);
	}

	public static void main(String[] args) {

		Calculator op = new Calculator();
		op.add(15,3);
		op.add(15, 3, 1);
		op.mul(15, 3);
		op.mul(12, 20.5);
		op.sub(15, 3);
		op.sub(20.5, 10.3);
		op.divide(20.5, 15);
		op.divide(15, 3);

	}

}
