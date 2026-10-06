public class St{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        boolean result = s1.equals(s2);
        System.out.println(result);
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3==s4);

        String s5 = "Hala Great";
        s5.substring (1,5);
        
        System.out.println(s5.substring(4));

    }
}
