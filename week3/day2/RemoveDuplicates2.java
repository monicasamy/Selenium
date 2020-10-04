package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates2 {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println(text);
		String[] Arr = text.split(" ");  		
		List<String> values = new ArrayList<String>();
		for (String eachdata : Arr) {
			values.add(eachdata);
		}
		System.out.println(values);
		
	     Set<String> newvalues = new LinkedHashSet<String>(values);
	     System.out.println(newvalues);
	     String newtext = newvalues.toString().replace("[", "").replace("]", "").replace(",", "");
	     System.out.println(newtext);
		
	}
		
	}	

