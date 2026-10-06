public class reverse {
    public static  void main (String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int first =0;
        int last = num.length-1;
      
          
           
        

        while(first < last){
            
            // Swap elements at first and last positions
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
            for (int i = 0; i < num.length; i++){
              
            System.out.print(num[i] + " ");
        
        
           
        }
        }
    }
}

