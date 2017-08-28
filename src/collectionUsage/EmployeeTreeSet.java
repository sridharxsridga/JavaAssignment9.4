/* TreeSet of Employee where default natural sorting order is ascending order of salaries. If two employees have same salary then consider alphabetical orders of
their names, and using  defined customized sorting which is alphabetical order of employee names. If two employees have same name then consider designation for
comparison.
*/
package collectionUsage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		// Generic TreeSet with object of Employee class.
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		// creating objects of Employee class
		Employee employee1 = new Employee("Abrahim", "Performance Test Engineer", 30000.00);
		Employee employee2 = new Employee("Sridhar", "ETL Test Engineer", 20000.00);
		Employee employee3 = new Employee("Sajish", "Manager", 40000.00);
		Employee employee4 = new Employee("Rakesh", "Automation Test Engineer", 35000.00);
		Employee employee5 = new Employee("Bikash", "Manual Test Engineer", 30000.00);
		Employee employee7 = new Employee("Sajish", " Analyst", 35000.00);
		Employee employee6 = new Employee("Amit", "Manual Test Engineer", 50000.00);
		Employee employee9 = new Employee("Amit", "Business Analyst", 35000.00);
		Employee employee8 = new Employee("Sajish", "Business Analyst", 45000.00);

		// Adding objects to treeSet
		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);
		treeSet.add(employee5);
		treeSet.add(employee6);
		treeSet.add(employee7);
		treeSet.add(employee8);
		treeSet.add(employee9);

		System.out.println("Employee Details: Ascending order of salaries and then name:");
		// Traversing TreeSet
		Iterator iterator1 = treeSet.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("------------------------------------------------------------------------");
		// Making treeSet to use the customized comparator , to do this we must
		// convert out set to list, so converting it to array list and passing
		// it with new comparator in sort method of Collection class
		ArrayList<Employee> arrayList = new ArrayList<Employee>(treeSet);
		Collections.sort(arrayList, new EmployeeComparator());// Using	customized comparator
														
		System.out.println("Employee Details: Ascending order of Name  and then designation:");
		Iterator iterator2 = arrayList.iterator();
		// Traversing TreeSet
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
