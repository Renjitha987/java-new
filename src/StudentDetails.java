import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter mark: ");
        double mark = sc.nextDouble();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Mark    : " + mark);

        sc.close();
    }
}


