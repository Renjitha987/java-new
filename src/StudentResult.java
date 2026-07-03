import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}