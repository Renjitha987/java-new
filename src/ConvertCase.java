import java.util.Scanner;
public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String upper=str.toUpperCase();
        System.out.println("Upper String: "+upper);
        sc.close();
    }
}
