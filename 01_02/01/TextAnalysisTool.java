import java.util.*;

public class TextAnalysisTool {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User Input: Prompt the user to enter a paragraph or lengthy text
        System.out.println("Enter a paragraph or lengthy text:");
        String text = scanner.nextLine();
        
        // Character Count: Calculate total characters in the input text
        int charCount = text.length();
        System.out.println("Total number of characters: " + charCount);
        
        // Word Count: Calculate total words in the input text
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        scanner.close();
        }
    }