/*
 * Program to add integer objects into ArrayList and print only even numbers present in the ArrayList.
 */
package collectionUsage;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenArrayList {

	public static void main(String[] args) {
		// Generic Arraylist with object of Integer class.
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Adding objects to arraylist
		list.add(20);
		list.add(21);
		list.add(30);
		list.add(56);
		list.add(78);
		list.add(43);
		list.add(23);
		list.add(67);
		list.add(55);
		list.add(30);
		//printing the even numbers when number % 2 == 0
		System.out.println("Even numbers present in the list");
		for(Integer value: list){//traversing through list
			if(value%2==0){
				System.out.println(value);
			}
		}
		

	}

}
