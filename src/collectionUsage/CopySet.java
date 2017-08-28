/*
 * Program to copy all the elements from set2 to set1 so that the set1 becomes the union of set1 and set2.
 * 
 */
package collectionUsage;

import java.util.HashSet;

public class CopySet {

	public static void main(String[] args) {
		// Generic HashSet set1 with object of Integer class.
		HashSet<Integer> set1 = new HashSet<Integer>();
		// Generic HashSet set2 with object of Integer class.
		HashSet<Integer> set2 = new HashSet<Integer>();
		// Adding elements to set1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		// Adding elements to set2
		set2.add(4);
		set2.add(5);
		set2.add(6);
		// copying all the elements from set2 to set1 
		set1.addAll(set2);
		
		for(Integer value: set1){//traversing through set2 and printing the values
			
				System.out.println(value);
			
		}

	}

}
