public class VariableLength {
    // variable length arguments
    static void display(String... name) {
        for (String a : name) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        display("Bishal", "Aryan", "Shikshya", "Prashant", "Pratiksha");
    }
}