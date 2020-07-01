package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		
		Employee e1 = new Employee(1, "Mailman", "Letter Me", 400);
		Employee e2 = new Employee(2, "Tester", "Accenture", 1200);
		Employee e3 = new Employee(3, "Developer", "Accenture", 1500);
		Employee e4 = new Employee(4, "Teacher", "Elementary nr 1", 600);
		Employee e5 = new Employee(5, "Journalist", "LNT", 700);
		Employee e6 = new Employee(6, "Librarian", "LNB", 500);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
	

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//employeeList.sort(e1);
		
		
		//	System.out.println() result

		//TODO 3 create instance of a Student as a Person ->
		Student s = new Student();
		Person p = s;
		// than ask him introduce()
		System.out.println(p.introduce());
				
		// than make them Student
		Student s2 = (Student)p;
		
		// than ask him introduce()
		System.out.println(s2.introduce());

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work
		
		changeWork(e1, 42, "Janitor", "RTU", 300);

	}
	
	public static void changeWork(Employee e, int empId, String jobTitle, String companyName, int salary){
		
		e.setEmpId(empId);
		e.setJobTitle(jobTitle);
		e.setCompanyName(companyName);
		e.setSalary(salary);
		
	}

	
	
}
