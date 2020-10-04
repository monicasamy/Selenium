package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
	    Arrays.sort(arr);
	    int j=0;	
		for (int i = arr[j]; i < arr.length;i++) 
		{
      
		if(i!=arr[j])
        {
        	System.out.println(i);
        	break;
		}
          j++;  
          

	}
	}
}
