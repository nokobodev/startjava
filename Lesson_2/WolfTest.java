public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.sex = "male";
		wolfOne.nickname = "Akela";
		wolfOne.weight = 40.5;
		wolfOne.age = 5;
		wolfOne.color = "grey";

		System.out.println("Wolf is a " + wolfOne.sex + ".");
		System.out.println("Wolf's nickname: " + wolfOne.nickname);
		System.out.println("Wolf's weight: " + wolfOne.weight + " kg.");
		System.out.println("Wolf's age: " + wolfOne.age);
		System.out.println("Wolf's color: " + wolfOne.color);
		System.out.println();	// Just a separator in console

		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		System.out.println(wolfOne.howl());
		wolfOne.hunt();
	}
}