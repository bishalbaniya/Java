class Sum {
    public int add(int a, int b) {
        return a + b;
    }

    protected void print() {
        System.out.println("Print");
    }
}

class Sub extends Sum {
    private void display() {
        System.out.println("Display");
    }
    
    void displayofSub() {
        display();
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.print();
        s1.displayofSub();
        System.out.println(s1.add(10, 20));
       
    }
}
