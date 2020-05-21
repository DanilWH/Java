package interfaces;

public interface Math {

    double PI = 3.14;

    static double sqr(int x) {
        return x * x;
    }

    static double max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    static double min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    static int factorial(int x) {
        if (x > 1) return x * Math.factorial(x - 1);
        else return 1;
    }
}