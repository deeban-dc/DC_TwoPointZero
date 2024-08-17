package DCs_Assignments;
/* Input a year and find whether it is a leap year or not.
Take two numbers and print the sum of both.
Take a number as input and print the multiplication table for it.
Take 2 numbers as inputs and find their HCF and LCM.
Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all. */
import java.util.*;

public class Flow_Of_Programs {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  System.out.print(LeapYear(1900));
        //  System.out.print(sum_of_two_numbers(234,435));
        //  TablesX(3);
        //  PrintingTillX();
        //  System.out.println(GCD(50,60));
        //  System.out.println(LCM(50,60));


    }

    private static boolean LeapYear(int year){
        if(year % 4 == 0 && (year % 400 == 0 || (year % 100) != 0)){
            return true;
        }
        else return false;
    }

    private static int sum_of_two_numbers(int a, int b){
        int sum = a +  b;
        return sum;
    }

    private static void TablesX(int num){
        for(int i = 1; i<11; i++){
            System.out.println(num +" x " + i + " = " + num*i );
        }
    }

    private static void PrintingTillX(){
        System.out.println("Enter num 0 = ");
        int sum = 0, i = 0;
        while(in.hasNextInt()){
           int num = in.nextInt();
           sum+=num;
           i++;
           System.out.println("Enter num "+ i +" =" );
        }
        System.out.print("Sum of the given i/p : "+ sum);
    }

    private static int GCD(int num1, int num2){


        int gcd = 0;
        for(int i = 1; i<=num1; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    private static int LCM (int num1 , int num2){
        int lcm = 0;
        return lcm = (Math.abs(num1*num2))/GCD(num1,num2);

    }
}
