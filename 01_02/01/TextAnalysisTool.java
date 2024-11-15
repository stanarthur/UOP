import java.util.*;

public class TextAnalysisTool {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User Input: Prompt the user to enter a paragraph or lengthy text
        System.out.println("Enter a paragraph or lengthy text:");
        String text = scanner.nextLine();
        // Output the entered text
        System.out.println("You entered: " + text);
        // Close the scanner
        scanner.close();
        }
    }