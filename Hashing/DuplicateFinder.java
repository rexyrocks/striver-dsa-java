import java.util.HashSet;

public class DuplicateFinder{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,4,6,8,7,4,6};
        for(int i = 0; i< arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println("duplicate element " +arr[i]+" found at index value"+ i);
            }
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
