import java.util.Scanner;
public class basma  {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("enter your number : ");
            int x = sc.nextInt();
           int z= 0;
           int count;
           count = 0;
            while(x!=0){
               x = x /10;
count++;
}
System.out.println(count);
    }
}
