import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        secretNumber = (int)(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        while (!player1.isWin() && !player2.isWin()) {
            System.out.print(player1.getName() + ", input your number: ");
            player1.setNumber(scanner.nextInt());
            if (compareNumbers(player1)) {
                player1.setIsWin(true);
            } else {
                System.out.print(player2.getName() + ", input your number: ");
                player2.setNumber(scanner.nextInt());
                if (compareNumbers(player2)) {
                    player2.setIsWin(true);
                }
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() > secretNumber) {
            System.out.println("The number you entered is greater than what the computer made");
            return false;
        } else if (player.getNumber() < secretNumber) {
            System.out.println("The number you entered is less than what the computer made");
            return false;
        } else {
            System.out.println(player.getName() + ", congratulations! You won!");
            return true;
        }
    }
}