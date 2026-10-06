import java.util.Scanner;
public class j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Year : " + a);
        switch (a % 4) {
            case 0:
                System.out.println("Leap Year");
                break;
            default:
                System.out.println("Not a Leap Year");

        }

       
    }
}
