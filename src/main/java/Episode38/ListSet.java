package Episode38;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;



public class ListSet {


	public static void main(String[] args) {
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(2);
//		Integer test3 = list1.get(0);
//		System.out.println(test3);
		
		List<String> list = new ArrayList<String>();
		list.add("pear");
		list.add("Mango");
		list.add("pear");
		list.add("Kiwi");
		list.add("Apple");
		
		/*
		 * boolean print = list.isEmpty();
		 *  System.out.println(print); 
		 *  list.clear();
		 * System.out.println(list.isEmpty());
		 */
		Collections.sort(list);
		for (String sortval : list) {
			System.out.println(sortval);
			
		}
		
		//String firstvalue = list.get(1);
		//System.out.println(firstvalue);
		
		//boolean test = list.contains("Kiwi");
		//System.out.println(test);
	
    
		//int size = list.size();
		//System.out.println(size);
		
		//Before Remove
		//for (String eachfruit : list) {
			//System.out.println(eachfruit);
			
		//}
		
		//list.remove("pear");
		
		//System.out.println("-------------------");
		
		//After Remove
		//for (String eachfruit : list) {
			//System.out.println(eachfruit);
		//}
		
		
		
		
	}

}
