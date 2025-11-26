package programs;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        String data = "Hello, this is a sample text written into a file!";

        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(data);
            writer.close();

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }  
}
