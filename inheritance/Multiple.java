package inheritance;

interface A {
    void displayA();
}

class B implements A {
    public void displayA() {
        System.out.println("Display form A");
    }

    void displayB() {
        System.out.println("Display form B");
    }
}

interface C extends A {
    void displayC();
}

class D extends B implements C {

    public void displayC() {
        System.out.println("Display from C");
    }

    void dispalyD() {
        System.out.println("Display form D");
    }
}

public class Multiple {
    public static void main(String[] args) {
        D D1 = new D();
        D1.displayA();
        D1.displayB();
        D1.displayC();
        D1.dispalyD();
    }
}
