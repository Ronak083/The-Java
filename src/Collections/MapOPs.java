package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapOPs{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
           map.put(3,"ronak");
           map.put(1,"ratan");
           map.put(2, "Aviral");
           for (Map.Entry<Integer, String > entry : map.entrySet()){
               System.out.println("Key: " + entry.getKey() + " Value: "+entry.getValue());
           }
        System.out.println(map.get(3));

        for (Integer i: map.keySet()) {
            System.out.println(i + map.get(i));
        }

    }
}