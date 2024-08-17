package DCs_Assignments;
import java.util.*;
public class Methods {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // smallest(1,2,3);
        // largest(1,2,3);
        // pythogarian triplet, sum of first n natural numbs.., primeeee
        // sumOfFirstNnaturalNumbers();
        // PythogoreanTriplet();
        System.out.println(isPrime());

    }

    private static void largest(int first, int second, int third){

        int max = first;
        if(second > max){
            max = second;
        }
        if(third > max){
            max = third;
        }
        System.out.println(max);
    }

    private static void smallest(int first, int second, int third){
        int min = first;
        if(second < min){
            min = second;
        }
        else if(third < min){
            min = third;
        }
        System.out.println(min);
    }

    private static void sumOfFirstNnaturalNumbers(){
        int num = in.nextInt();
        int sum = 0;
//        for(int i = 1; i<=num; i++){
//            sum+=i;
//        }
        sum = (num * (num+1))/2;
        System.out.println(sum);
    }

    private static void PythogoreanTriplet(){
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("its a pythogorean triplet");
        }
        else System.out.println("not a pythogorean triplet");
    }

    private static boolean isPrime(){
        int num = in.nextInt();
        boolean isPrime = true;
        if(num<2) isPrime  = false;
        for(int i = 2; i<num/2; i++){
            if(num%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
