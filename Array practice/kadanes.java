public class kadanes {
    public static void kadanes (int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++) {
            cs += num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum is: " + ms);
    }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}