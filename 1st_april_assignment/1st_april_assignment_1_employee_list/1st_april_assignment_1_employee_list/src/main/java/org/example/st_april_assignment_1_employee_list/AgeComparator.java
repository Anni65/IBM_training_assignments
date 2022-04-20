package org.example.st_april_assignment_1_employee_list;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

import org.example.st_april_assignment_1_employee_list.model.*;
public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		 int r= o1.age - o2.age;
		 boolean abc=false;
		 if(r==0)
		 {
			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				abc=(sdf.parse(o1.getDateOfJoining()).before(sdf.parse(o2.getDateOfJoining())));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(abc==true)
			return -1;
			
		 }
		 return r;
	}

}
