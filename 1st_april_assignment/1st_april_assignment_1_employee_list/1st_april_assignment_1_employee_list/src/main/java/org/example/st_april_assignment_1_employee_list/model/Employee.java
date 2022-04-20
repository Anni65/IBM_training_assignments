package org.example.st_april_assignment_1_employee_list.model;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	private int employeeId=0;
	private String employeeName;
	private String Department;
	private String dateOfJoining;
	public int age;
	private double salary;
	public Employee(int employeeId, String employeeName, String department, String dateOfJoining, int age,
			double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		Department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
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
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "   "+employeeId+"   "+"   "+"   "+"  "+employeeName+"   "+Department+"   "+"  "+dateOfJoining+"     "+age+"    "+salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		Employee employee=(Employee)o;
		if(this.getSalary()>employee.getSalary()) {
			return 1;
		}
		else if(this.getSalary()<employee.getSalary()) {
			return -1;
		}
		else
		return 0;
	}
	
	
}
