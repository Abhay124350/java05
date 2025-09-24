package Unit3;

import java.util.ArrayList;

class Arraylist1 {
    public static void main(String args[]) {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(12);
      a.add(13);
      a.add(24);
      for(int alist: a){
          System.out.println(alist);
      }
    }
}