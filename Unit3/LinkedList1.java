package Unit3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class LinkedList1 {
    public static void main( String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        for(int i = 0;i<n; i++){
            l1.add(sc.nextInt());
        }
        Iterator itr = l1.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(l1);
        System.out.println("Min "+l1.getFirst());
        System.out.println("Max"+l1.getLast());
    }
}
