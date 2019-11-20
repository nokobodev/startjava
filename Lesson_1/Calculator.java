public class Calculator {
	
	public static void main(String[] args) {
		int firstNumber = 2;
		char mathOperator = '^';
		int secondNumber = 5;
						
		if (mathOperator == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if (mathOperator == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if (mathOperator == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if (mathOperator == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if (mathOperator == '^') {
			int result = 1;
			for (int i = 0; i < secondNumber; i++) {
				result *= firstNumber; 
			}
			System.out.println(result);
		} else if (mathOperator == '%') {
			System.out.println(firstNumber % secondNumber);
		} else {
			System.out.println("Wrong math sign!");
		}		
	}
}