package com.ashifshadab.problem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = getEmployeeData();

		// Printing All Employee
		printAllEmp(employeeList);

		// Write a program to print employee details working in each department
		findEmpListBasedOnDept(employeeList);

		// Write a program to print employees count working in each department
		findEmpCountBasedOnDept(employeeList);

		// Write a program to print active and inactive employees
		findActiveInctiveEmp(employeeList);
		
		// Write a program to print Max/Min employee salary from the given collection
		maxMinSalary(employeeList);
		
		// Write a program to print the max salary of an employee from each department
		Map<Integer,Optional<Employee>>topSalaryEmpDepWise=employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		topSalaryEmpDepWise.entrySet().forEach(entry->System.out.println(entry.getKey()+"--"+entry.getValue().get()));
	}

	private static void maxMinSalary(List<Employee> employeeList) {
		Optional<Employee> maxSalaryEmp = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> minSalaryEmp = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("\nMax salary taken by: " + maxSalaryEmp.get());
		System.out.println("\nMin salary taken by: " + minSalaryEmp.get());
	}

	private static void findActiveInctiveEmp(List<Employee> employeeList) {
		long activeEmpCount = employeeList.stream().filter(employee -> "active".equals(employee.getStatus())).count();

		long inactiveEmpCount = employeeList.stream().filter(employee -> "inactive".equals(employee.getStatus()))
				.count();

		System.out.println(
				"\nActive Employee Count is : " + activeEmpCount + " Inactive Employe Count is : " + inactiveEmpCount);

		List<Employee> activeEmpList = employeeList.stream().filter(employee -> "active".equals(employee.getStatus()))
				.collect(Collectors.toList());

		List<Employee> inactiveEmpList = employeeList.stream()
				.filter(employee -> "inactive".equals(employee.getStatus())).collect(Collectors.toList());

		System.out.println("\nActive Employee are: -");
		activeEmpList.stream().forEach(System.out::println);

		System.out.println("\nInactive Employee are: -");
		inactiveEmpList.stream().forEach(System.out::println);
	}

	private static void findEmpCountBasedOnDept(List<Employee> employeeList) {
		Map<Integer, Long> employeeCountBasedOnDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

		System.out.println("\nPrinting employees count working in each department!");
		employeeCountBasedOnDept.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue()));
	}

	private static void findEmpListBasedOnDept(List<Employee> employeeList) {
		Map<Integer, List<Employee>> employeeListBasedOnDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

		System.out.println("\nPrinting employees details working in each department!");
		employeeListBasedOnDept.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + "-----" + entry.getValue()));
	}

	private static void printAllEmp(List<Employee> employeeList) {
		System.out.println("Printing all Employee deatils");
		employeeList.stream().forEach(System.out::println);
	}

	private static List<Employee> getEmployeeData() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(101, "Sunday", 501, "active", 2000));
		employeeList.add(new Employee(102, "Monday", 502, "active", 5000));
		employeeList.add(new Employee(103, "Tuesday", 502, "inactive", 6000));
		employeeList.add(new Employee(104, "Wednessday", 503, "inactive", 4000));
		employeeList.add(new Employee(105, "Thursday", 503, "active", 3500));
		employeeList.add(new Employee(106, "Friday", 504, "inctive", 3500));
		employeeList.add(new Employee(107, "Saturday", 501, "active", 1000));

		return employeeList;
	}

}
