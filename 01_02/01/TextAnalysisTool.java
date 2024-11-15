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

         // Most Common Character: Find the most common character (case-insensitive)
         String textLower = text.toLowerCase();
         Map<Character, Integer> charFrequency = new HashMap<>();
         
         for (char c : textLower.toCharArray()) {
             if (Character.isLetter(c)) {  // Only count alphabetic characters
                 charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
             }
         }

          // Determine the most common character
        char mostCommonChar = Collections.max(charFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most common character: '" + mostCommonChar + "'");
        
        // Character Frequency: Check frequency of a user-inputted character (case-insensitive)
        System.out.print("Enter a character to check its frequency: ");
        char targetChar = scanner.nextLine().toLowerCase().charAt(0);
        long targetCharFrequency = textLower.chars().filter(c -> c == targetChar).count();
        System.out.println("The character '" + targetChar + "' appears " + targetCharFrequency + " times.");
        
        // Word Frequency: Check frequency of a user-inputted word (case-insensitive)
        System.out.print("Enter a word to check its frequency: ");
        String targetWord = scanner.nextLine().toLowerCase();
        int wordFrequency = 0;
        
        for (String word : words) {
            if (word.toLowerCase().equals(targetWord)) {
                wordFrequency++;
            }
        }
        
        System.out.println("The word '" + targetWord + "' appears " + wordFrequency + " times.");
        
        // Unique Words: Calculate the number of unique words (case-insensitive)
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        
        int uniqueWordCount = uniqueWords.size();
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
        }
    }