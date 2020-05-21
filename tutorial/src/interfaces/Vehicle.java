package interfaces;

public interface Vehicle {

    final int gear = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out() {
        System.out.println("Default method");
    }

    static int math(int b) {
        return b + 56;
    }
}