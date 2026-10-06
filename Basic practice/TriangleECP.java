
import java.util.Scanner;

public class TriangleECP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check valid range
        if (a < 1 || b < 1 || c < 1 || a > 10 || b > 10 || c > 10) {
            System.out.println("Invalid Input");
        }
        // Check triangle inequality
        else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a Triangle");
        }
        // Equilateral
        else if (a == b && b == c) {
            System.out.println("Equilateral");
        }
        // Isosceles
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        }
        // Scalene
        else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}
