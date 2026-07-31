import java.util.Scanner;
public class selection {
    public static int[] selectionsort(int[] arr,int n){
        for(int i = 0; i <n-1; i++){
            int mini  = i;
            for(int j = i+1; j<n; j++){
if(arr[mini] > arr[j])
    mini = j;
  }
int temp = arr[i];
arr[i] = arr[mini];
arr[mini] = temp;
        }
return arr;

    }
    public static int[] filler(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <n; i++){
            System.out.println("enter your "+ i+ " element." );
arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of your array: ");
int n = sc.nextInt();
int[] arr = new int[n];
filler(arr, n);
selectionsort(arr, n);
for (int num : arr) {
        System.out.print(num + " ");
    }
    }
}


