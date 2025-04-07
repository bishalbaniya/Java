class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("x = " + x);
        }   
    }
}

class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

    }
}