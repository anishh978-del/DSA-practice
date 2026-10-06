public class b {
    public static void main(String[] args) {
        int num = 10998;
        int rev = 0;
        
        while (num>0){
            int H = num %10;
            num = num /10;
            rev = rev *10 + H;
        }
        System.out.println(rev);
            
        }
        
    }

