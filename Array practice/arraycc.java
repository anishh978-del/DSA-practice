
import java.util.*;

public class arraycc {
    public static void main(String[] args) {
        
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks of student 1: " + marks[0]);
        System.out.println("Marks of student 2: " + marks[1]);  
        System.out.println("Marks of student 3: " + marks[2]);
        int per = (marks[0]+ marks[1]+ marks [2])/3;
        System.out.println("percentage of student 1: " + per);
  
    }
}