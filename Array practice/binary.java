public class binary {
    public static void main (String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int key = 5;

        int start = 0;
        int end = num.length - 1;

         while (start<=end){
            int mid = (start + end) / 2;
            if (num[mid] == key){
                System.out.println("Element found at index: " + mid);
                break;
            }
            else if (num[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            System.out.println("index for the key is"+ num[key]);
        }
        
    }
    
}
