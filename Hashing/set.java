import java.util.HashMap;
import java.util.Map;
public class set{
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,7,4,6};
HashMap<Integer,Integer> map =new HashMap<>();
for(int i = 0; i<arr.length; i++){
    
    map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
}
int high = 0,maxelement = 0;

System.out.println(map);
for(Map.Entry< Integer , Integer> Entry: map.entrySet()){
    if(Entry.getValue() >= high){
        high  = Entry.getValue();
        maxelement = Entry.getKey();
    }

}
System.out.println(" the highest element is "+maxelement + " which occurs " + high+ " times ");
    }
}