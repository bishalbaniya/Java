
class Class1 {
    static void disply() {
        System.out.println("Display using static binding"); // static binding
    }
}

class Parent {
    void displayParent() {
        System.out.println("Dispaly from the parent");
    }

}

class Child extends Parent {
    void displayChild() {
        System.out.println("Display form the Child");
    }

}

public class Binding {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.displayParent();
        c1.displayChild();
        Class1.disply();

    }
}
