package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	private int age;
	private String firstName;
	private String secondName;
	
	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws PersonException {
		
		if(firstName.matches(".*\\d.*")){
			throw new PersonException();
		}
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) throws PersonException {
		if(firstName.matches(".*\\d.*")){
			throw new PersonException();
		}
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName();
	}
	
	public String introduce() {
		return "My name is " + getFirstName() + " and I am "+ getAge()+ " years old";
	}
	
	
}

