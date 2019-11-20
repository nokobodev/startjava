public class Calculator {
	
	public static void main(String[] args) {
		int firstNumber = 2;
		char mathSign = '^';
		int secondNumber = 5;
						
		if(mathSign == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if(mathSign == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if(mathSign == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if(mathSign == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if(mathSign == '^') {
			int sum = firstNumber;
			for (int i = 1; i < secondNumber; i++) {
				sum *= firstNumber; 
			}
			System.out.println(sum);
		} else if(mathSign == '%') {
			System.out.println(firstNumber % secondNumber);
		} else {
			System.out.println("Wrong math sign!");
		}		
	}
}