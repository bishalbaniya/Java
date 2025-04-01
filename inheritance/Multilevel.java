package inheritance;

class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("This dog is Barking");
    }
}

class GoldenRetriver extends Dog {

    void breed_type() {
        System.out.println("This is Golden Retriever");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        GoldenRetriver G1 = new GoldenRetriver();
        G1.eat();
        G1.bark();
        G1.breed_type();
    }
}
