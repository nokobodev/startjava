public class Wolf {
	
	private String sex;
	private String nickname;
	private double weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age!");
		} else {
			this.age = age;
		}		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void walk() {
		System.out.println("I'm walking!");
	}

	public void sit() {
		System.out.println("I'm sitting!");
	}

	public void run() {
		System.out.println("I'm running!");
	}

	public String howl() {
		String someHowl = "Wooo-wooo-wooo!!!";
		System.out.print("This howl heard from PRINTLN: " + someHowl + " ");
		return "This howl heard from RETURN: " + someHowl + " :)";
	}

	public void hunt() {
		System.out.println("I'm hunting!");
	}
}