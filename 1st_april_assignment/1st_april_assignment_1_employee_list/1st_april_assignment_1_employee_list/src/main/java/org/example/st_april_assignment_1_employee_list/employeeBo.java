package org.example.st_april_assignment_1_employee_list;
import org.example.st_april_assignment_1_employee_list.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.example.st_april_assignment_1_employee_list.model.Employee;

public class employeeBo {
public static void emp_print(List<Employee> emp) {
	Iterator<Employee> iterator= emp.iterator();

	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}


}
