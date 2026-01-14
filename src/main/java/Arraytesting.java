import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;

public class Arraytesting {

	public static void main(String[] args) {
		// To find max and min value in array
		int shanav[] = {100,20,99,77,11,88};
		int min = shanav[0];
		int max = shanav[0];
		System.out.println("length" + shanav.length);
		System.out.println(Arrays.toString(shanav));
		for(int i=0; i < shanav.length; i++) {
			if(shanav[i] < min) {
				min = shanav[i];				
				
			}
		}
		
		for(int i =0; i< shanav.length; i++) {
			if(shanav[i] > max) {
				max = shanav[i];
				
			}
		}

		System.out.println("minimum value=" +min );
		System.out.println("maximum value=" +max );
		
		String original = "thiru";
		String reverse = new StringBuilder(original).reverse().toString();
		System.out.println(reverse);
		
			
		// To find the middle number
		int mugil[] = {100,20,99,77,88, 100,111};
		int mugilLength = mugil.length;
		int index;
		if (mugilLength % 2 == 0) {
			 index = mugilLength/2;
		}
		else {
			index = (mugilLength/2) + 1;
		}
		System.out.println("middle value=" +mugil[index-1] );
			
		
        int mugil1[] = {100,20,99,77,88};
		
		int thiru2[] = {11,22,33,44,77,88,99};
		int length = thiru2.length;
		if (length % 2 ==0) {
			index = length/2;
			}
		else {
			index =(length/2) + 1;
		}
		
		System.out.println("Middle value" + thiru2[index -1] );
	}

}
		
	 


