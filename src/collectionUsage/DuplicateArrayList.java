/*
 * Program to print the duplicate values in an array list.
 */
package collectionUsage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateArrayList {

	public static void main(String[] args) {
		//  Generic Arraylist with object of Integer class.
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Adding objects to arraylist
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(43);
		list.add(43);
		list.add(80);
		list.add(70);
		list.add(60);
		list.add(50);
		//Creating hash set with array list values which contains only unique values
		HashSet<Integer> set = new HashSet<Integer>(list);
		
		/*
		 * Get the duplicate numbers present by checking values present in hash set has more than one number of occurence in arraylist. 
		 */
		System.out.println("Duplicate numbers present in the list");
		for(Integer value: set){
			int counter =0;
			for(int index=0;index<list.size();index++){
				if(value==list.get(index)){//if value present in set equals value present in list, increment counter, if the more occurence is present counter will be greater than 1 or else 1 only 
					counter++;
				}
			}
			if(counter>1){// when more than one number of occurence then print the value
				System.out.println(value);
			}
		}
		

	}

}
