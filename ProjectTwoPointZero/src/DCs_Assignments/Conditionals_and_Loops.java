package DCs_Assignments;
import java.util.*;

public class Conditionals_and_Loops {
    static Scanner in = new Scanner(System.in);
    static float total_credits = 0, total_grade_points =  0, total_gpa = 0;

    public static void main(String[] args) throws Exception {
        //  CGPA();
        //  factors();
        //  rev_string();
    }

    private static void CGPA(){
        System.out.println("Enter no of semesters : ");
        int no_of_semester = in.nextInt();
            for(int i = 1; i<=no_of_semester; i++){
                System.out.println("Enter No of Subjects in Sem " + i);
                int no_of_subjects = in.nextInt();

                for(int j = 1; j<=no_of_subjects; j++){
                    System.out.println("Enter the grade of subject "+j+" and it's respective credit ");
                    int grade = in.nextInt();
                    int credit = in.nextInt();
                    total_grade_points += grade*credit;
                    total_credits += credit;
                }
                System.out.println("GPA FOR SEM "+i+" "+total_grade_points/total_credits);
                total_gpa+=(total_grade_points/total_credits);
            }
        System.out.println("CGPA : "+total_gpa/no_of_semester);
    }

    private static void factors() throws Exception{
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0) System.out.print(i+" ");
            Thread.sleep(400);
        }
    }

    private static void rev_string(){
        String str = in.nextLine();
        String ans = "";
        for(int i = str.length()-1; i>=0; i--){
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }

}