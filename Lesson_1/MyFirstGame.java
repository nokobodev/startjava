public class MyFirstGame {

	public static void main(String[] args) {
		int secretNumber = 87;
		int inputNumber = 53;

		while(secretNumber != inputNumber) {
			if(secretNumber > inputNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер.");					
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер.");					
			}
			inputNumber = 87;			
		}
		System.out.println("Вы угадали!");		
	}
}