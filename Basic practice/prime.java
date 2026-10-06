public class prime {
    public static void main(String[] args) {
        int b =100;
       for (int a = 2; a < b; a++) {

    boolean isPrime = true;


    for (int i = 2; i < a; i++) {
        if (a % i == 0) {
            isPrime = false;
            System.err.println("not prime"+a);
            break;
        }
    }

    if (isPrime) {
        System.out.println("Prime: " + a);
    }
   
}
}
}