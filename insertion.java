public class insertion {
    public static int[] insertionsort(int[] arr){
        for(int i = 1; i<arr.length; i++ ){
int key = arr[i];
int j = i-1;
for( ;j>=0 && arr[j] > key;j--){
    arr[j+1] = arr[j];
  
}
arr[j+1] =key;


        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,4,3,1};
int [] sortedarr = insertionsort(arr);
for(int i = 0; i<arr.length; i++){
    System.out.print(sortedarr[i]+ " ");
}

    }
    
}
