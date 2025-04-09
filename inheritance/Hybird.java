package inheritance;

interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

interface Pet {
    void play();
}

class Dog implements Mammal, Pet {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void walk() {
        System.out.println("Dog walks.");
    }

    public void play() {
        System.out.println("Dog plays.");
    }
}

public class Hybird {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.play();
    }
}
