package NimTwist
public class Sorts {
	private static int[] generator(int size) {
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = (int) (Math.random() * size * 2);
        }
        return values;
    }
    public static void main(String args[]) {
        
        int [] binaryTest = generator(100);
        System.out.println(binarySearch(binaryTest, 0, binaryTest.length-1, 23));
      
    }
    
    public static int binarySearch( int[] arr, int lower, int upper , int target){
        
        int mid = (lower + upper)/2;
        
        if ( arr[mid] ==target){
            return mid; 
        }
        else if( lower == upper){
            return -1;
        }
        else{
            
            if( target > arr[mid]){
                binarySearch(arr, arr.length+1-mid, upper, target);
            }
            else{
                binarySearch(arr, lower, mid, target);
            }
        }
        return -1; 
    }
}
