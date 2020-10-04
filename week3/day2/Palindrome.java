package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "madam";
		String reverse = "";
		for (int i= word.length() -1  ; i>=0 ; i-- )
		{
			reverse = reverse +  word.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
