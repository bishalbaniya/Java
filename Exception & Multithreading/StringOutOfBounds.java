public class StringOutOfBounds {

    public static void main(String[] args) {
        String text = "Hello";
        try {
            char ch = text.charAt(10);
            System.out.println("Character at index 10: " + ch);
            
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught" + e);
            
        }
    }
}