package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
	
    private String schoolName;

	public Student() {
		super();
		this.schoolName = "Unknown";
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String introduce() {
		return "I am studying in university " + getSchoolName();
	}
	
}
