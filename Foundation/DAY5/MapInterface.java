package DAY5;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Ram");
        map.put(2, "Suresh");
        map.put(3, "Vinay");
        map.put(4, "Bhavesh");
        System.out.println(map);
        // for(var e:map.keySet()){
        //     System.out.println(e);
        // }
        // for(var e:map.values()){
        //     System.out.println(e);
        // }
        for (var e : map.entrySet()) {
            System.out.println(e.getValue());
        }
    }
    
}
