import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter side a: " + a);
        float sum = a * a;
        System.out.println("Square of the number: " + sum);
        sc.close();

    }
}
