package DCs_Assignments;
import java.util.*;
/*Write a program to print whether a number is even or odd, also take input from the user.
  Take name as input and print a greeting message for that particular name.
  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
  Take 2 numbers as input and print the largest number.
  Input currency in rupees and output in USD.
  To calculate Fibonacci Series up to n numbers.
  To find out whether the given String is Palindrome or not.
  To find Armstrong Number between two given number. */

public class Basic_Programs {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // oddOrEven();
        // PrintGreeting();
        // Simple_Interest();
        // operators();
        // largestnum();
        // inrTousd();
        // FibuptoN();
        // Palindrome();
        IsArmstrong();

    }

    private static void oddOrEven() {
        int num = in.nextInt();
        if (num % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }

    private static void PrintGreeting() {
        String str = in.nextLine();
        System.out.println("Happy Birthday " + str);
    }

    private static void Simple_Interest() {
        int principal = in.nextInt();
        int time = in.nextInt();
        int rate = in.nextInt();
        int si = (principal * time * rate) / 100;
        System.out.println(si);
    }

    private static void operators() {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println("quotient :" + num1 / num2);
                break;
            case '%':
                System.out.println("remainder :" + num1 % num2);
                break;
            default:
                System.out.println("invalid input. please do enter only math operators.");
                break;

        }
    }

    private static void largestnum(){
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int larg = (num1 > num2) ? num1 : num2; //ternary op

        System.out.println(larg);
    }

    private static void inrTOusd(){
        double num1 = in.nextInt();

        System.out.println(num1 / 80);
    }

    private static void FibuptoN(){
        int n = in.nextInt();
        int first_num = 0;
        int sec_num = 1;
        System.out.print(first_num+" "+sec_num+" ");
        for(int i = 2; i<n ; i++){
            int third_num = first_num + sec_num;
            System.out.print(third_num + " ");
            first_num = sec_num;
            sec_num = third_num;
        }
    }

    private static void Palindrome(){
        int number = in.nextInt();
        int original = number;
        int reversed = 0;
        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number/=10;
        }
        String result = (original==reversed) ? "It's a Palindrome" : "It's not a Palindrome";
        System.out.println(result);
    }

    private static void IsArmstrong(){
        int input = in.nextInt();
        int length = (input+"").length();
        int original = input;
        int answer = 0;
        while(input>0){
            int digit = input % 10;
            answer += (int)Math.pow(digit,length);
            input/=10;
        }

        String op = (original == answer) ? "Armstrong Number" : "Not an Armstrong Number";
        System.out.println(op);
    }
}
