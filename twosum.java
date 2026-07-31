
import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    public static void main(String args[]){
HashMap< Integer, Integer> map =  new HashMap<>();
int[] arr = {3,56,4,4,6,};
Scanner sc = new Scanner(System.in);
System.out.println("enter the element which you wanna search for the sum of two elements");
int target = sc.nextInt();
for(int i = 0; i< arr.length; i++){
int remainder = target-arr[i];
if(map.containsKey(remainder)){
    System.out.println("the two values are "+ arr[i] + " and " + remainder +" found at indices " +i+ " and " + map.get(remainder) );
}
map.put(arr[i],i);
}
    }
}
