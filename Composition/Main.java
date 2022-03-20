package Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
	// Creating the Objects of Book class.
	Employee b1 = new Employee("Falia Davina Gustaman", "Android Developer");
	Employee b2 = new Employee("Helsa Alika Femiani", "BackEnd Developer");
	Employee b3 = new Employee("Amelia Nathasa", "Programmer");
	// Creating the list which contains the
	// no. of books.
	List<Employee> sal = new ArrayList<Employee>();
	sal.add(b1);
	sal.add(b2);
	sal.add(b3);
	Salary salary = new Salary(sal);
	List<Employee> emps = salary.getSalaryInEmp();
	for(Employee emp : emps){
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Position      : " + emp.getPosition());
		System.out.println("+======================================+\n");
		}
	}
}
