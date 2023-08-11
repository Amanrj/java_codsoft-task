import java.util.Scanner;

public class word_counter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        System.out.println("Word count: " + wordCount);
        
        scanner.close();
    }
    
    // Count the number of words in the given input string
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}