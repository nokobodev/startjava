public class Calculator {
	
	private int firstNumber;
	private char mathOperator;
	private int secondNumber;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setMathOperator(char mathOperator) {
		this.mathOperator = mathOperator;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void calculation() {
		switch (mathOperator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '^':
                int result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber; 
				}
				System.out.println(result);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Incorrect math operator!");
                break;
        }
	}
}