class Sum {
    static int result; // Static field to sore the sum

    static void add(int a, int b) {
        result = a + b; // store the sum in the static field
    }
}

class Area {
    static double pi = 3.14519;

    static double circle(double r) {
        return pi * r * r;
    }
}

public class StaticField {
    public static void main(String[] args) {
        Sum.add(10, 20);
        System.out.println("Sum: " + Sum.result);
        double result = Area.circle(5);
        System.out.println("Area of circle: " + result);
    }
}
