public class midsort {
    public static int[] merge(int[] arr,int left,int right) {
     int mid = left+(right-left)/2;
     int s1 = (mid-left)+1;
     int s2 = right-mid;
     int [] leftarr = new int[s1];
     int [] rightarr = new int[s2];
     for(int i =0; i<s1; i++){
        leftarr[i] = arr[left+i];
     }
      for(int i =0; i<s2; i++){
        rightarr[i] = arr[mid+i+1];
     }
     int i = 0; int j = 0; int k = left;
     while(i < s1 && j <s2 ){
if(leftarr[i] > rightarr[j]){
    arr[k++] = rightarr[j++];
}
else{
    arr[k++] = leftarr[i++];
}
     }
    while(i < s1) {
        arr[k++] = leftarr[i++];
    }
    while(j < s2) {
        arr[k++] = rightarr[j++];
    }
      return arr;  
    }
    public static void breaker(int[] arr,int left , int right){
        if(left >= right){
            return;
        }
        int mid = left+(right-left)/2;
        breaker(arr, left, mid);
        breaker(arr, mid +1, right);
        merge(arr, left, right);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        breaker(arr, 0, arr.length - 1);
        for (int x : arr) System.out.print(x + " ");
    }
}