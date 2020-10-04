package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] Arr = test.split(" ");
		String reversedString = "";
	    String reverseWord = "";
		
		for ( int i = 0; i < Arr.length; i++)
		{
			String words = Arr[i];
			
			if (i%2!=0)
			{
			for (int j = words.length()-1; j >= 0; j--)
			{
				reverseWord = reverseWord + words.charAt(j); 	
			}	
			reversedString = reversedString + reverseWord + " "; 
			reverseWord = "";
			}
			else
			{
				reversedString = reversedString + Arr[i] + " ";
			}
			
			
		}

		System.out.println(reversedString);
	}

	
}

