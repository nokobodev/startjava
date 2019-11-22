import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean result = true;
        while (result) {
            System.out.print("Input first number: ");
            calculator.setFirstNumber(sc.nextInt());
            System.out.print("Input math operation: ");
            calculator.setMathOperator(sc.next().charAt(0));
            System.out.print("Input second number: ");
            calculator.setSecondNumber(sc.nextInt());
            calculator.calculate();
            do {
                System.out.print("Want to continue? [yes/no]: ");
                String userAnswer = sc.next();
                if (userAnswer.equals("no")) {
                    result = false;
                }
            } while (result);
        }
    }
}