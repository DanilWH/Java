package interfaces;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.speedUp(10);
        ford.changeGear(2);
        ford.display();

        // working with static methods allocated inside of an interface.
        int x = Vehicle.math(5);
        System.out.println(x);

        // interfaces can be useful when you don't need to create a class instance
        // and all methods and attributes most be static. Just like the Math interface.
        System.out.println(Math.PI);
        System.out.println(Math.sqr(6));
        System.out.println(Math.max(7, -7));
        System.out.println(Math.min(5, 7));
        System.out.println(Math.factorial(5));
    }
}