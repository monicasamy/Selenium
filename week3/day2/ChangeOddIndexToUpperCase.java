package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] Arr = test.toCharArray();
		for ( int i = 0; i < Arr.length; i++)
		{
			int j = i%2;
			if(j!=0)
			{
				Arr[i]=Character.toUpperCase(Arr[i]);				
			}	
		}
		System.out.println(Arr);
	}

}
