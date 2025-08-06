package collections;
import java.util.*;
import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {
        //HashSet --> HashMap --> Array of nodes(key, value)
        // new object(); // dummy object
        //it follows random oreder
        
        // HashSet<Integer> hs= new HashSet<>();

        // hs.add(3);
        // hs.add(45);
        // hs.add(76);
        // hs.add(2);
        // hs.add(67);

        // hs.clear
        // System.out.println(hs.remove(3));
        // System.out.println(hs.contains(4));
        // System.out.println(hs);
        

        // for (Integer integer : hs) {
        //     System.out.println(integer);
        // }

        //   LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
  //it follows insertion  oredr
        //   LinkedHashSet --> LinkedHashMap --> link of nodes(key, value)

        // lhs.add(3);
        // lhs.add(45);
        // lhs.add(76);
        // lhs.add(2);
        // lhs.add(67);

        // lhs.clear();

    

        // System.out.println(lhs.remove(3));
        // System.out.println(lhs.contains(4));
        // System.out.println(lhs);
        // System.out.println(lhs.isEmpty());

        // for (Integer integer : lhs) {
        //     System.out.println(integer);
        // }

     TreeSet<Integer> ts = new TreeSet<>();
     // TreeSet --> TreeMap --> binary tree
 // it follows sorted order

        ts.add(3);
        ts.add(45);
        ts.add(76);
        ts.add(2);
        ts.add(67);

        // System.out.println(ts.first());
        // System.out.println(ts.last());
        // System.out.println(ts.pollFirst());
        // System.out.println(ts.pollLast());
        System.out.println(ts.subSet(45, 77));  // range
        System.out.println(ts.subSet(45, 77).remove(46));  
        System.out.println(ts.descendingSet());

        System.out.println(ts);


        
    }
}
