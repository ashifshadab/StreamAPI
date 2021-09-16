package com.ashifshadab.problem1;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private int Salary;

	public Employee(int id, String name, LocalDate dateOfBirth, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", Salary=" + Salary + "]";
	}
	
	

}
