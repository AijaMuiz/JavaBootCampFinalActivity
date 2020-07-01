package sef.ATestTask.FirstActivity;

public class PersonException extends Exception {

	public String getMessage() {
        return "Person name cannot contain numbers!";
    }

}
