public class subarry {
    public static void printSubarray(int num[]) {
        for(int i = 0; i<= num.length; i++) {
            
            for(int j = i; j<= num.length; j++) {
                for(int k = i; k<j; k++) {
                    
                    System.out.print(num[k] + " ");
                 
                    int sum = 0;
                    for(int l = i; l<j; l++) {
                        sum += num[l];
                    }
                    System.out.println("Sum of subarray from index " + i + " to " + (j-1) + " is: " + sum);
                    
                    
                    
                }
                System.out.println();
            }
        }


    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        printSubarray(num);
    }
}
