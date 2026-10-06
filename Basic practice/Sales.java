import java.util.Scanner;

public class Sales{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales amount: ₹");
        double sales = sc.nextDouble();

        double commission;

        if (sales < 0) {
            System.out.println("Invalid sales amount. Sales cannot be negative.");
        } 
        else if (sales <= 1000) {
            commission = sales * 0.05;
            System.out.printf("Commission = ₹%.2f%n", commission);
        } 
        else if (sales <= 2000) {
            commission = sales * 0.07;
            System.out.printf("Commission = ₹%.2f%n", commission);
        } 
        else if (sales <= 3000) {
            commission = sales * 0.10;
            System.out.printf("Commission = ₹%.2f%n", commission);
        } 
        else {
            commission = sales * 0.12;
            System.out.printf("Commission = ₹%.2f%n", commission);
        }

        sc.close();
    }
}