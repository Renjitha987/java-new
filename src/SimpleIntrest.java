import java.util.Scanner;
public class SimpleIntrest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount");
        int pricipal=sc.nextInt();
//System.out.print("enter the rae of intrest");
//double rate=sc.nextDouble();
        final double DEFAULT_RATE = 5.0;

        System.out.print("enter the time");
        int time=sc.nextInt();
        double SI=(pricipal*DEFAULT_RATE*time)/100;

        System.out.println("simple intrest : "+ SI);


    }}