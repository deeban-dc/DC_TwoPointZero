package DCs_Assignments;
import java.util.*;
public class ArrayList_aka_DynamicArray {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> intu = new ArrayList<>();
        for (int i = 5; i >=1 ; i--) {
            intu.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(intu.get(i));
        }

        Collections.sort(intu);

        for (int i = 0; i < 5; i++) {
            System.out.println(intu.get(i));
        }

        ArrayList<String> str = new ArrayList<>();
        str.add("Deeban");
        str.add("Chakravarthy");
        str.add("Rajendran");
        for(String i : str){
            System.out.println(i);
        }




        
    }
}
