package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
	
	public static void main(String[] args) {
		String[] companies =  {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> values = new ArrayList<String>();
	for (String eachdata : companies) {
		values.add(eachdata);
	}
	System.out.println(values);
     Set<String> newvalues = new TreeSet<String>(values);
     System.out.println(newvalues);
     	
	}
}
