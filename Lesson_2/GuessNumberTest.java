import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First player, enter your name: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Second player, enter your name: ");
        Player player2 = new Player(scanner.next());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        boolean result = true;
        while (result) { 
            guessNumber.startGame();
            do {
                System.out.print("Want to continue? [yes/no]: ");
                String userAnswer = scanner.next();
                if (userAnswer.equals("no")) {
                    result = false;
                }
            } while (result);
        }
    }
}