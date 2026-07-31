public class bubble {
    public static int[] bubblesort(int[] arr, int n ){
        for(int i = 0; i< n-1; i++){
            for(int j = 0; j< n-i-1; j++){
               if( arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
      int[]  arr = {5,5,7,3,2,5,6,45,4,4};
      int[] sorted = bubblesort(arr, arr.length);
      for(int i = 0 ; i < sorted.length; i++){
        System.out.print(arr[i] + " ");
      }
    }
    
}
