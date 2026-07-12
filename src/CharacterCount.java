import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Read the character
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        int count = 0;

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Display the result
        System.out.println(count);

        sc.close();
    }
}