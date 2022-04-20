package org.example.st_april_assignment_1_employee_list;

import org.example.st_april_assignment_1_employee_list.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		employeeBo emp_print=new employeeBo();
		System.out.println("Enter Number of employees");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println("Enter employee"	+i+" Details:");
			String name=sc.next();
			String dept=sc.next();
			String doj=sc.next();
			int age=sc.nextInt();
			double sal=sc.nextDouble();
			emp.add(new Employee(i,name,dept,doj,age,sal));
			i++;
		}while(i<=n);
		System.out.print("1.Sort employees by salary\r\n"
				+ "2.Sort employees by age and by date of joining\r\n"
				+ "Enter your choice\r\n"
				+ "");
		int ch=sc.nextInt();
		System.out.println("EmnployeeId   Name   Dept   DOJ      \tAge   Salary");
		switch(ch)
		{
		case 1:
			emp_print.emp_print(emp);
			break;
		case 2:
			
			Collections.sort(emp,new AgeComparator());
			emp_print.emp_print(emp);
			break;
		case 0:
			System.out.print("Thank u");
			System.exit(0);
			break;
			
		}
		
				// TODO Auto-generated method stub

	}

}
