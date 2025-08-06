package collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuePractice {
    public static void main(String[] args) {
        //add,offer,peek,poll,remove
        
        // PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(6);
        // pq.offer(5);
        // pq.add(3);
        
       
        // System.out.println(pq);
        // // System.out.println( pq.peek());
        // // System.out.println(pq.poll());
        // // System.out.println(pq.remove());
        
        // while (!pq.isEmpty()) {
        //     System.err.println(pq.poll());
            
        // }

        // System.out.println(pq);

        ArrayDeque<String> ad = new ArrayDeque<>();

        //add,addfirst,addlast,offer,offerfirst,offerlast,
        //peek,peekfirst,peeklast,poll,pollfirst,polllast,
        //remove,removefirst,removelast
        ad.add("banana");
        ad.offerFirst("apple");
        ad.offerLast("pear");
        ad.addFirst("kiwi");
        ad.addLast("mango");

        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad.size());


       
    }
}
