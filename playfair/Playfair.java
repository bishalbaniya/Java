package playfair;
import java.util.Scanner;

public class Playfair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = sc.nextLine();
        System.out.print("Enter Keyword: ");
        String keyword = sc.nextLine();

        
        System.out.println(message);
        System.out.println(keyword);
        sc.close();
        }
    
}
