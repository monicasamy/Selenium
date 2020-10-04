package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
	
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] Arr = test.toCharArray();
		for ( int i = 0; i < Arr.length; i++)
		{
			boolean a = Character.isLetter(Arr[i]);
			boolean b = Character.isSpaceChar(Arr[i]);
			boolean c = Character.isDigit(Arr[i]);
			
			if (a!=false)
			{
				letter = letter + 1;				
			}
			else if(b!=false)
			
			{
				space = space + 1;
			}
			else if(c!=false)
			{
				num = num +1;
			}
			else
			{
			  specialChar = specialChar +1;
			}
					
		}
		
		System.out.println(letter);
		System.out.println(space);
		System.out.println(num);
		System.out.println(specialChar);
	
	}

}
