package inheritance;

class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is Barking");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }

}
