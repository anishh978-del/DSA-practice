class n {
   
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int add = a + b;
        int multiply = a * b;
        
        
        System.out.println("The addition of " + a + " and " + b + " is: " + add);
        System.out.println("The multiplication of " + a + " and " + b + " is: " + multiply);
        if (add == multiply) {
            System.out.println("Addition is equal to multiplication.");
   
        } else {
            System.out.println("They are not equal .");
        }
    
       for (int i = 1; i <= 10; i++) {
        System.out.println(i);


           
       }

        for (int i = 1; i <= 100; i += 2) {
        System.out.println("Odd numbers: " + i);
        
        
    }
    }
}

