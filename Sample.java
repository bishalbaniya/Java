// Function Overloading Example
public class Sample {

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.display(10);
        obj.display(10.0);
        obj.display(10, 20);
    }
}
