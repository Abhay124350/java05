package Unit3;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("c", 3);
        System.out.println(hm.get("A"));
        System.out.println(hm.containsKey("B"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.containsValue(2));
        for(Map.Entry<String,Integer> hm1 : hm.entrySet()){
            System.out.println(hm1.getKey());
            System.out.println(hm1.getValue());
        }
    }
}
