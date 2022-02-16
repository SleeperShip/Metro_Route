import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String pathToFile = new String("/uploads/subway_stops2.txt");
        File file = new File(pathToFile);
        MyLinkedList list = new MyLinkedList();
       
        try (Scanner scanner = new Scanner(file)) {
             while (scanner.hasNext()) {
                //System.out.println(scanner.nextLine());
                list.addAtTail(scanner.nextLine());
             }
        } catch (FileNotFoundException e) {
                System.out.println("No file found: " + pathToFile);
        }
       
        list.addAtHead("depot");
        list.addAtTail("depot");
        //list.printList();
        //System.out.println("----------------------------------------");
        //System.out.println("List size: " + list.size);
        
        displayLines(list);
    }
    
    public static void displayLines(MyLinkedList list) {
        for (int i = 0; i < list.size - 2; i++) {
            System.out.println(list.get(i) + " - " + list.get(i + 1) + " - " + list.get(i + 2));
        }
    }
}
