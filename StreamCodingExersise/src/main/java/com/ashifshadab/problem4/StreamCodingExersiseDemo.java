package com.ashifshadab.problem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = getEmployeeList();

		// How many male and female employees are there in the organization?
		getNoOfMaleAndFemaleEmp(employeeList);

		// Print the name of all departments in the organization?
		findDepartmentList(employeeList);

		// What is the average age of male and female employees?
		findAverageAgeOfMaleAndFemaleEmp(employeeList);

		// Get the details of highest paid employee in the organization?
		getHighestPaidEmp(employeeList);

		// Get the names of all employees who have joined after 2015?
		findEmpJoinedAfterSomeDate(employeeList);

		// Count the number of employees in each department?
		findNumberOfEmployeesbyDept(employeeList);

		// What is the average salary of each department?
		findAverageSalaryOfEachDept(employeeList);

		// Get the details of youngest male employee in the product development
		// department?
		findYoungestMaleInProductDevelopmentDept(employeeList);

		// Who has the most working experience in the organization?
		findSeniorMostEmployee(employeeList);

		// How many male and female employees are there in the sales and marketing team?
		findCountMaleAndFemaleInSomeDept(employeeList);

		// What is the average salary of male and female employees?
		findAverageSalaryOfMaleAndFemale(employeeList);

		// List down the names of all employees in each department?
		findNameOfAllEmp(employeeList);

		// What is the average salary and total salary of the whole organization?
		findAverageAndTotalSalaryInOrg(employeeList);

		// Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years.

		findEmpOldercodition(employeeList);

		// Who is the oldest employee in the organization? What is his age and which
		// department he belongs to?
		findOldestEmployeeOrg(employeeList);

	}

	// Who is the oldest employee in the organization? What is his age and which
	// department he belongs to?
	private static void findOldestEmployeeOrg(List<Employee> employeeList) {
		Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println("\noldest employee in the organization Age,Department" + oldestEmployee.get());
	}

	// Separate the employees who are younger or equal to 25 years from those
	// employees who are older than 25 years.
	private static void findEmpOldercodition(List<Employee> employeeList) {
		System.out.println(
				"\nEmployees who are younger or equal to 25 years from those employees who are older than 25 years");
		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
	}

	// What is the average salary and total salary of the whole organization?
	private static void findAverageAndTotalSalaryInOrg(List<Employee> employeeList) {
		System.out.println("\nAverage salary and total salary of the whole organization");
		DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage() + " Total Salary = "
				+ employeeSalaryStatistics.getSum());
	}

	// List down the names of all employees in each department?
	private static void findNameOfAllEmp(List<Employee> employeeList) {
		System.out.println("\nNames of all employees in each department");
		Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(employeeListByDepartment);
	}

	// What is the average salary of male and female employees?
	private static void findAverageSalaryOfMaleAndFemale(List<Employee> employeeList) {
		System.out.println("\nAverage salary of male and female employees");
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryOfMaleAndFemaleEmployees);
	}

	// How many male and female employees are there in the sales and marketing team?
	private static void findCountMaleAndFemaleInSomeDept(List<Employee> employeeList) {

		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(
				"\nSale and Marketing Team Male and Female Emp count : " + countMaleFemaleEmployeesInSalesMarketing);
	}

	private static void findSeniorMostEmployee(List<Employee> employeeList) {
		Optional<Employee> seniorMostEmployee = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println("\nMost Working Experience in the Org : " + seniorMostEmployee.get());
	}

	// Get the details of youngest male employee in the product development
	// department?
	private static void findYoungestMaleInProductDevelopmentDept(List<Employee> employeeList) {

		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> "Male".equals(e.getGender()) && "Product Development".equals(e.getDepartment()))
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("\nDetails Of Youngest Male Employee In Product Development");
		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId() + " Name : "
				+ youngestMaleEmployeeInProductDevelopment.getName());

	}

	// What is the average salary of each department?
	private static void findAverageSalaryOfEachDept(List<Employee> employeeList) {
		Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

		System.out.println("\nAverage Salary of each Department");

		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// Count the number of employees in each department?
	private static void findNumberOfEmployeesbyDept(List<Employee> employeeList) {
		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		System.out.println("\nNumber of Employee in each Department:- ");

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// Get the names of all employees who have joined after 2015?
	private static void findEmpJoinedAfterSomeDate(List<Employee> employeeList) {
		employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
	}

	// Get the details of highest paid employee in the organization?
	private static void getHighestPaidEmp(List<Employee> employeeList) {
		Optional<Employee> highestPaidEmp = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("\nHighest Paid Emp is : " + highestPaidEmp.get());

		// or
		/*
		 * Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
		 * .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 * System.out.println(highestPaidEmployeeWrapper.get().getName());
		 */
	}

	// What is the average age of male and female employees?
	private static void findAverageAgeOfMaleAndFemaleEmp(List<Employee> employeeList) {
		Map<String, Double> averageAgeOfMaleAndFemaleEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("\nAverage Age of Male and Female Employee is : " + averageAgeOfMaleAndFemaleEmp);
	}

	//// Print the name of all departments in the organization?
	private static void findDepartmentList(List<Employee> employeeList) {

		List<String> departmentList = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());

		System.out.println("\nName of all departments in the organization are : ");

		departmentList.forEach(System.out::println);

		// or
		// employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	// How many male and female employees are there in the organization?
	private static void getNoOfMaleAndFemaleEmp(List<Employee> employeeList) {

		Map<String, Long> noOfMaleAndFemaleEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("Male and Female employees are there in the organization");

		System.out.println(noOfMaleAndFemaleEmp);
	}

	private static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		return employeeList;
	}

}
