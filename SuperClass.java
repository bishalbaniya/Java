import java.io.File;

public class SuperClass {
    public static void Sample() {
        System.out.println("Method of Super Class");
    }

}

public class Function_Overriding extends SuperClass {

    public static void Sample() {
        System.out.println("Method of Sub Class");
    }

    public static void main(String[] args) {
        Function_Overriding obj1 = new Function_Overriding();
        SuperClass obj2 = new Function_Overriding();
        obj1.Sample();
        obj2.Sample();
    }
}
