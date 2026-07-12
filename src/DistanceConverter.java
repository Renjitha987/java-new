import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt user for distance in kilometers
        System.out.print("Enter distance in km: ");
        double kilometers = scanner.nextDouble();

        // Calculate: Apply the conversion expressions
        double meters = kilometers * 1000;
        double centimeters = meters * 100;

        // Output: Display the calculated results
        System.out.println("\nMeters = " + (int)meters);
        System.out.println("Centimeters = " + (int)centimeters);

        // Close the scanner resource
        scanner.close();
    }
}