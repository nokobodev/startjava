public class Wolf {
	
	String sex;
	String nickname;
	double weight;
	int age;
	String color;

	void walk() {
		System.out.println("I'm walking!");
	}

	void sit() {
		System.out.println("I'm sitting!");
	}

	void run() {
		System.out.println("I'm running!");
	}

	String howl() {
		String someHowl = "Wooo-wooo-wooo!!!";
		System.out.print("This howl heard from PRINTLN: " + someHowl + " ");
		return "This howl heard from RETURN: " + someHowl + " :)";
	}

	void hunt() {
		System.out.println("I'm hunting!");
	}
}