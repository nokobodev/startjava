public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7.890f, 8, 4, 6);
        // Jaeger jaegerOne = new Jaeger();
        // jaegerOne.setModelName("Horizon Brave");
        // jaegerOne.setMark("Mark-1");
        // jaegerOne.setOrigin("China");
        // jaegerOne.setHeight(72.54f);
        // jaegerOne.setWeight(7.890f);
        // jaegerOne.setSpeed(8);
        // jaegerOne.setStrength(4);
        // jaegerOne.setArmor(6);

        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);
        // Jaeger jaegerTwo = new Jaeger();
        // jaegerTwo.setModelName("Coyote Tango");
        // jaegerTwo.setMark("Mark-1");
        // jaegerTwo.setOrigin("Japan");
        // jaegerTwo.setHeight(85.34f);
        // jaegerTwo.setWeight(2.312f);
        // jaegerTwo.setSpeed(5);
        // jaegerTwo.setStrength(7);
        // jaegerTwo.setArmor(4);

        System.out.println("You are inside of \"" + jaegerOne.getModelName() + "\".");
        jaegerOne.drift();
        jaegerOne.move();
        System.out.println(jaegerOne.getModelName() + "\'s armor before: "+ jaegerOne.getArmor());
        jaegerOne.setArmor(5);
        System.out.println(jaegerOne.getModelName() + "\'s armor after: "+ jaegerOne.getArmor());
        System.out.println();           // Just a separator for Console.

        System.out.println("You are inside of \"" + jaegerTwo.getModelName() + "\".");
        jaegerTwo.drift();
        jaegerTwo.scanKaiju();
        System.out.println(jaegerTwo.getModelName() + "\'s strength before: " + jaegerTwo.getStrength());
        jaegerTwo.setStrength(5);
        System.out.println(jaegerTwo.getModelName() + "\'s strength after: " + jaegerTwo.getStrength());
    }
}