public class Cycle {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);			
		}
		System.out.println();

		int i = 6;
		while(i >= -6) {
			System.out.println(i);
			i = i - 2;
		}
		System.out.println();

		int sum = 0;
		int j = 10;
		do {
			if(j % 2 != 0) {
				sum = sum + j;
			}			
			j++;
		} while(j <= 20);
		System.out.println("The total sum is " + sum + ".");
	}
}