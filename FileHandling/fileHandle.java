import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to store in the file: ");
        String userInput = sc.nextLine();
        String filePath = "C:\\Users\\bisha\\OneDrive - Paudel tech\\Documents\\Personal\\Java\\text.txt";
        try{
            FileWriter writer = new FileWriter(filePath);
            writer.write(userInput);
            writer.close();
            System.out.println("String written to file successfully." + filePath); ;
        }        
        catch (IOException e) {
            System.out.println("An error occured while writing to the file");
        }
        sc.close();                
    }
}
