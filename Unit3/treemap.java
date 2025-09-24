package Unit3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Character,Integer> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char c : s.toCharArray()){
            tm.put(c,tm.getOrDefault(c,0)+1);

        }
        for(Map.Entry m: tm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
