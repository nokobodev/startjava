public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 41;
		char sex = 'M';
		double height = 1.73;
		char firstLetterOfName = 'K';

		if(age > 20) {
			System.out.println("At " + age + ", life is just beginning!");
		}		

		if(sex == 'M') {
			System.out.println("Male");
		}

		if(sex != 'M') {
			System.out.println("Female");
		}

		if(height < 1.80) {
			System.out.println("Normal");
		} else {
			System.out.println("Tall");
		}

		if(firstLetterOfName == 'M') {
			System.out.println("Miroslav");
		} else if(firstLetterOfName == 'I') {
			System.out.println("Ivan");
		} else {
			System.out.println("Kurmanbek");
		}
	}
}