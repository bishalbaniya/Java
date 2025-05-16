import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClassForReading {
    public static void main(String[] args) {
        try {
            File F1 = new File("d.txt");
            Scanner Sc = new Scanner(F1);

            // reading file
            while (Sc.hasNextLine()) {
                String line = Sc.nextLine();
                System.out.println(line);
            }
            Sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occured " + e.getLocalizedMessage());
        }
    }
}
