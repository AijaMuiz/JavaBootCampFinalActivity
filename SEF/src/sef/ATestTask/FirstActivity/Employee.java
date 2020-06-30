package sef.ATestTask.FirstActivity;

import java.util.Comparator;

public class Employee extends Person implements Comparator<Employee> {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
    	super();
    	this.empId= 0;
		this.jobTitle = "Unknown";
		this.companyName = "Unknown";
		this.salary = 0;

    }
    public Employee (int empid, String jobTitle, String companyName, int salary){
    	super();
    	this.empId= empid;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
	}
    
    public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    //TODO 3 override method announce()
	public String announce() {
		return "My name is "+getFirstName()+" and i am "+getAge()+
				" years old I am working as "+getJobTitle()+" in "+getCompanyName();
	}
	
	@Override
    public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
    }

}