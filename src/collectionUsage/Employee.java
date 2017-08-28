/*
 * Employee class to hold properties with name, designation and their salary
 */
package collectionUsage;

import java.util.Comparator;

/**
 * Implementing Comparable interface which imposes a total ordering on the objects of each class that implements it. 
 * This ordering is referred to as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
 *  
 */
public class Employee implements Comparable<Employee>  {
private String name;
private String designation;
private double salary;

/**
 * @param name
 * @param desgination
 * @param salary
 */
public Employee(String name, String designation,double salary){
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the designation
 */
public String getDesgination() {
	return designation;
}

/**
 * @param desgination the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}

/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}

/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/*
 * (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 * Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as 
 * this object is less than, equal to, or greater than the specified object.
 * 
 */
@Override
	public int compareTo(Employee employee) {//natural comparison method.
		if (this.salary > employee.salary  )
			return 1;
		if (this.salary == employee.salary ) // If salary is same , use name to sort
			return this.name.compareTo(employee.name);
		else return -1 ;
				
		}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 * Overriding toString method to object class to display employee properties 
 */
public String toString(){
	return "Employee name:"+getName()+" , Designation:"+getDesgination()+" , Salary:"+getSalary();
}


}
