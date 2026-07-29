import java.util.Scanner;
public class basma3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st number");
        int z = sc.nextInt();
 System.out.println("enter your 2nd number");
 int x = sc.nextInt();
 while(x!= 0){
    int temp = x;
    x = z%x;
    z = temp;
 }
 System.out.println(z);
    
    }
}
