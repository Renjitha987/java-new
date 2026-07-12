import java.util.Scanner;
class ElectricityBill{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        final double RATE_PER_UNIT =7.5;
        System.out.print("enter Units: ");
        int units=sc.nextInt();
        double Electricity_Bill=units*RATE_PER_UNIT;
        System.out.println("bill "+Electricity_Bill);
    }}
