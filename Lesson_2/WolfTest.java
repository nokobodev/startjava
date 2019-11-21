public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex("male");
		wolfOne.setNickname("Akela");
		wolfOne.setWeight(40.5);
		wolfOne.setAge(9);
		wolfOne.setColor("grey");

		System.out.println("Wolf is a " + wolfOne.getSex() + ".");
		System.out.println("Wolf's nickname: " + wolfOne.getNickname());
		System.out.println("Wolf's weight: " + wolfOne.getWeight() + " kg.");
		System.out.println("Wolf's age: " + wolfOne.getAge());
		System.out.println("Wolf's color: " + wolfOne.getColor());
		System.out.println();	// Just a separator in console

		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		System.out.println(wolfOne.howl());
		wolfOne.hunt();
	}
}