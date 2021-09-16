package com.ashifshadab.problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**Print Youngest and oldest Employee **/
public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = getEmployeeList();
		
		System.out.println("Printing All Employee Deatils");
		employeeList.stream().forEach(System.out::println);
		
		Employee youngestEmployee = employeeList.stream().max(Comparator.comparing(Employee ::getDateOfBirth)).get();
		
		System.out.println("Printing Younges Employee Deatils");
		System.out.println(youngestEmployee);

		Employee oldestEmployee =employeeList.stream().min(Comparator.comparing(Employee::getDateOfBirth)).get();
		
		System.out.println("Printing Oldest Employee Deatils");
		System.out.println(oldestEmployee);
		
	}

	private static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Raj", LocalDate.of(1991, 1, 1), 30000));
		empList.add(new Employee(2, "Veena", LocalDate.of(1976, 7, 9), 30000));
		empList.add(new Employee(3, "Mikel", LocalDate.of(1992, 8, 1), 50000));
		empList.add(new Employee(4, "Devid", LocalDate.of(2001, 3, 11), 50000));
		return empList;
	}

}
