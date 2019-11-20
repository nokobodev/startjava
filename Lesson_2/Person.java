public class Person {
	
	String sex = "male";
	String name = "Alex";
	double height = 1.73;
	double weight = 73.5;
	int age = 41;

	void walk() {
		System.out.println("I'm walking.");
	}

	void sit() {
		System.out.println("I'm sittiing.");
	}

	void run() {
		System.out.println("I'm running.");
	}

	String speak() {
		String somePhrase = "Bla-bla-bla";
		System.out.println(somePhrase);
		return somePhrase;
	}

	void learnJava() {
		System.out.println("I'm learning Java.");
	}
}