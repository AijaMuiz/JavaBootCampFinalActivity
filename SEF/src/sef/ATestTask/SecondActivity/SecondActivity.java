package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}

	//TODO create the Calculator (here or in additional class)	
	public double sum(double firstNumber, double secondNumber){
		double result = firstNumber + secondNumber;
		return result;
	}
	
	public double subtract(double firstNumber, double secondNumber){
		double result = firstNumber - secondNumber;
		return result;
	}
	
	public double divide(double firstNumber, double secondNumber){
		double result = firstNumber/secondNumber;
		return result;
	}
	
	public double multiply(double firstNumber, double secondNumber){
		double result = firstNumber*secondNumber;
		return result;
	}
		
	
}


