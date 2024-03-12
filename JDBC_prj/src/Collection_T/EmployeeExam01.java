package Collection_T;

import javaExamDto.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		var list = new  ArrayList<Employee>();

		Collections.sort(list);
		System.out.println(list);
		for(Employee i : list) {
			System.out.println(i);
			
		}
		
		;
	}

}
