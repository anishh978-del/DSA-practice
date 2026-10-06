import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        // The scanner is declared inside the try block and auto-closes
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side a: ");
            int a = sc.nextInt();

            System.out.print("Enter side b: ");
            int b = sc.nextInt();

            System.out.print("Enter side c: ");
            int c = sc.nextInt();

            // Check whether sides are within the valid range
            if (a < 1 || a > 10 || b < 1 || b > 10 || c < 1 || c > 10) {
                System.out.println("Invalid Input");
            }
            // Check triangle inequality
            else if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Not a Triangle");
            }
            // Check for equilateral triangle
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            }
            // Check for isosceles triangle
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
            // Otherwise scalene
            else {
                System.out.println("Scalene");
            }
        } // Scanner closes automatically here
    }
}
