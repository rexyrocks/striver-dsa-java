
import java.util.Scanner;

public class main {
      public static void filler(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n;i++){
System.out.println("Enter your " +(i+1) +" element for your 1d array");
 arr[i]= sc.nextInt();
      }}
     public static void display(int arr[],int n){
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
     }
    public static void ulta(int arr[],int p,int q){
      
        if (p>=q){
            return;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        ulta(arr,p+1,q-1);
    }
    public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of your arrays");
int n  = sc.nextInt();
int p,q;
p = 0;
q = n-1;
int arr[] = new int[n];
filler(arr, n);
display(arr, n);
ulta(arr,p,q);
display(arr, n);
    }
}
