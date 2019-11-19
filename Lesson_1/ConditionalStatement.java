public class ConditionalStatement {

	public static void main(String[] args) {
		int age = 41;
		if(age > 20) {
			System.out.println("At " + age + ", life is just beginning!");
		}		

		boolean isMale = true;
		if(isMale) {
			System.out.println("Male");
		}
		
		if(!isMale) {
			System.out.println("Female");
		}

		double height = 1.73;
		if(height < 1.80) {
			System.out.println("Normal");
		} else {
			System.out.println("Tall");
		}

		char firstLetterOfName = 'K';
		if(firstLetterOfName == 'M') {
			System.out.println("Miroslav");
		} else if(firstLetterOfName == 'I') {
			System.out.println("Ivan");
		} else {
			System.out.println("Kurmanbek");
		}
	}
}