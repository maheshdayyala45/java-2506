package collections;

import java.util.*;
//size- no. of elements present in list
//capacity- array capacity =10
//vector java 1.0
//collections 1.2
//Generics

public class VectorPractice{

    public static void main(String[] args) {
        // Object[] arr= new Object[]{1,2,3,4,5};
        // Vector<Integer> v1= new Vector(Arrays.asList(arr));
        Vector<Integer> v1= new Vector<>();
        v1.add(1);
        v1.add(2);

        Vector<Integer> v2= new Vector<>();
        v2.add(10);
        v2.add(20);
        v2.add(null);
        v1.addAll(v2);
        v1.addAll(v2);
        // v1.clear();
        System.out.println(v1.get(4));
        System.out.println(v1.lastIndexOf(10));
        System.out.println(v1.lastElement());
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        // Object[] arr=v1.toArray();
        // System.out.println(Arrays.toString(arr));
        System.out.println(v1.remove(1));
        System.out.println(v1.containsAll(v2));
    }
}