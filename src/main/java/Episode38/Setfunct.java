package Episode38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setfunct {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("pear");
		set.add("Mango");
		set.add("pear");
		set.add("Kiwi");
		set.add("Apple");
		//no get function
		/*boolean value = set.contains("Mango");
		System.out.println(value);
		boolean value1 = set.isEmpty();
		System.out.println(value1);
		for (String onefr : set) {
			System.out.println(onefr);
		set.clear();
		System.out.println(set.size());*/
		
		
		//To get all the value, 1st we need to call list
		List<String> list = new ArrayList<String>(set);
		for (String test : list) {
			System.out.println(test);
			
		}
		String test2 = list.get(2);
		System.out.println(test2);
		
	
		
			
		

	}

}

