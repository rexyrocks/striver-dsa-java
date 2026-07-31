
import java.util.HashMap;

public class hash {
    
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(map);
        map.put("kunal",100);
        map.put("abhisek", 90);
        System.out.println(map);
       System.out.println( map.get("kunal"));
        System.out.println(map.containsKey("abhisek"));
        map.remove("kunal");
        System.out.println(map);
    }
}
