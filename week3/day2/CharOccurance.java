package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		char[] Arr = str.toCharArray();
		for ( int i = 0; i < Arr.length; i++)
		{
			if (Arr[i] == 'e')
			{
				count = count +1;
				
			}			
			
		}
		System.out.println(count);
	}
}
