package Unit3;

import  java.util.Scanner;
import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0;i<n;i++){
            String product = sc.next();
            hs.add(product);
            System.out.print(hs.size());
        }
    }
}
