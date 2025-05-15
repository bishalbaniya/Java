abstract class Animal {
   abstract public void eat();    
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats food.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eats food.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.eat();
        c1.eat();
    }

}
