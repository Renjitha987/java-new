import java.util.Scanner;

public class MobilePlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constant
        final double DATA_LIMIT = 30.0;

        // Input
        System.out.print("Enter data used (GB): ");
        double usedData = sc.nextDouble();

        // Calculation
        double remainingData = DATA_LIMIT - usedData;

        // Output
        System.out.println("Used: " + usedData + " GB");
        System.out.println("Remaining: " + remainingData + " GB");

        sc.close();
    }
}