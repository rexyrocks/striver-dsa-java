
import java.util.Scanner;

public class basma1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int z  = sc.nextInt();
        int y = z;
        int rev = 0;
        int i = 0;
while(z!= 0){
    
    int x =z%10;
    rev = rev *10 + x;
    i++;
    z = z/10;
}
if(rev == y){
       System.out.println("number entered is a palindrome");
      
}
else {
       System.out.println("number entered is not a palindrome");
}

    }
}
