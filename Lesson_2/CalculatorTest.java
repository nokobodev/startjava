import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String userAnswer = "yes";		

		while (userAnswer.equals("yes")) {
			System.out.print("Input first number: ");
			calculator.setFirstNumber(sc.nextInt());
			System.out.print("Input math operation: ");
			calculator.setMathOperator(sc.next().charAt(0));
			System.out.print("Input second number: ");
			calculator.setSecondNumber(sc.nextInt());
			calculator.calculation();
			do {
				System.out.print("Want to continue? [yes/no]: ");
				userAnswer = sc.next();				
			} while (!userAnswer.equals("yes") && !userAnswer.equals("no"));			
		}
	}
}