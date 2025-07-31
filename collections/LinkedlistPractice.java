package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistPractice {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("y1");
        ll.add("y2");

        ArrayList<String> al = new ArrayList<>();
        al.add("s1");
        al.add("ss");
     
        
        ll.addAll(0,al);
        // ll.removeAll(al);
        System.out.println(ll.get(3));
        System.out.println(ll.contains("ss"));
        ll.set(2, "aa");
       
        ll.clear();
         System.out.println(ll);
    }
}
