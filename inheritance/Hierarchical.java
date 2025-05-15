package inheritance;

class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat Meows");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        c1.eat();
        c1.meow();
        d1.eat();
        d1.bark();
    }
}
