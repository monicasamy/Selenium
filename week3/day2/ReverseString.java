package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
	
		String test = "feeling good";
		char[] Arr = test.toCharArray();
		for(int i = Arr.length - 1; i >= 0 ; i--)
		{
			System.out.print(Arr[i]);
		}
		


	}

}
