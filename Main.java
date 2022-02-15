import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String pathToFile = new String(args[0]);
        File file = new File(pathToFile);
       
        try (Scanner scanner = new Scanner(file)) {
             while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
             }
        } catch (FileNotFoundException e) {
                System.out.println("No file found: " + pathToFile);
        }
       
       
    }
}
