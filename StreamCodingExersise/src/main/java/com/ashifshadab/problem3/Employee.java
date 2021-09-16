package com.ashifshadab.problem3;

public class Employee {

	private int employeeId;
	
	private String employeeName;
	
	private int deptId;
	
	private String status ="active";
	
	private int salary;

	public Employee(int employeeId, String employeeName, int deptId, String status, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptId=" + deptId
				+ ", status=" + status + ", salary=" + salary + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
