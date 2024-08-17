package DCs_Assignments;

import java.util.Scanner;

public class Arrays {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        largest();

    }

    private static void largest(){
        int length = 5;
        int[] arr = new int[length];
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > largest) largest = arr[i];
        }
        System.out.println(largest);
    }
}
