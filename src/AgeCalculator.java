import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the current age");
        int current =sc.nextInt();
        System.out.println("enter the birth year");
        int birthyear=sc.nextInt();
        int age= current-birthyear;
        System.out.println("Age=" + age);
        sc.close();

    }}