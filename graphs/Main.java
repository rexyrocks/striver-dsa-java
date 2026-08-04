
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("enter the length of your queuue");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
System.out.println("enter the "+ (i+1) + " element of your list");
        int z = sc.nextInt();
queue.add(z);
}
for(int i = 0; i< n; i++){
    int z = queue.poll();
    System.out.print(z + " ");
}
System.out.println("");
    
System.out.println(queue);
}
}