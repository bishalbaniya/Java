

class Parent {
    int num = 10;

    Parent(String msg) {
        System.out.println("Parent Constructor " + msg);
    }

    void display() {
        System.out.println("Dispaly function from Base Class");
    }
}

class Child extends Parent {
    Child() {
        super("calling form child"); // Calls Parent() constructor
        System.out.println("Child Constructor");
        super.display();
        System.out.println(super.num);

    }
}

public class SuperKey {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}
