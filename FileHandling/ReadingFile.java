import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("text.txt");
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (IOException e) {
            System.out.println("An Error Occured!!");
        }
    }

}
