
import java.util.Scanner;

public class Sca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Radius of the circle: " + a);
        float area = 3.14f * a * a;
        System.out.println("Area of the circle: " + area);
        sc.close();
    }
}