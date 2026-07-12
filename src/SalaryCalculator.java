import java.util.Scanner;
class SalaryCalcualator{
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;
        System.out.println("enter the basic Salary: ");
        double basic=sc.nextDouble();
        double da = basic *DA_RATE;
        double hra = basic * HRA_RATE;

        double Gross_Salary= basic+ da +hra;
        System.out.println(" da:"+da);
        System.out.println(" hra:"+ hra);
        System.out.println(" gross salary: "+  Gross_Salary);
        sc.close();
    }}
