import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

public class Main {
    
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
    
        String appendRegex = "(\\/append \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";  //command "line" "station"
        String addHeadRegex = "(\\/add-head \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";
        String removeRegex = "(\\/remove \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";
        String outputRegex = "\\/output \"\\w+( \\w+)*\"";
        String exitRegex = "/exit";        
        
        while (true) {
            if (userInput.isEmpty()) {
                continue;
            }
            
            if (userInput.matches(exitRegex)) {
                return;
            }
            
            if(userInput.matches(appendRegex)) {
                ;
            }
            
            if (userInput.matches(addHeadRegex)) {
                ;
            }
            
            if (userInput.matches(removeRegex)) {
                ;
            }
            
            if (userInput.matches(outputRegex)) {
                
            }
        }
    }
   
    public static void main(String[] args) {
        /*
            -------------------------------------------------------------------        
            Program Commands:
            -------------------------------------------------------------------
            /append "[line name]" "[station name]"  - adds a new station at the end of the line
            /add-head "[line name]" "[station name]"    - adds a new station at the beginning
            /remove "[line name]" "[station name]"  - removes a station
            /output "[line name]"   - prints a line
            /exit   - quit program
           
            -----------------------------------------------------------------------
            A note about syntax :
            -----------------------------------------------------------------------
            If the name of the line or station consists of several words,
            you should write it in quotation marks (after, they should be excluded from the name).
            If the name of a station consists of one word it can be entered with or without quotes.
        */
       
        String appendRegex = "(\\/append \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";  //command "line" "station"
        String addHeadRegex = "(\\/add-head \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";
        String removeRegex = "(\\/remove \"\\w+( \\w+)*\" \"*\\w+\"*|\\/append \"\\w+( \\w+)*\" \"\\w+( \\w+)\")";
        String outputRegex = "\\/output \"\\w+( \\w+)*\"";
        String exitRegex = "/exit";
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        System.out.println("Input: " + testString);
        //System.out.println("Regex: " + appendRegex1);
        System.out.println("Matches: " + testString.matches(appendRegex1));
        System.out.println("-------------------------------------------------------------------");
    }
}
