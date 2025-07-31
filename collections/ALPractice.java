package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ALPractice {
    public static void main(String[] args) {
        Integer[] arr =new Integer[]{1,2,3,4};
        ArrayList<Integer> al1= new ArrayList<>(Arrays.asList(arr));
        al1.add(5);
        
        al1.set(0, 3);
        System.out.println(al1);
        // for(int i=0;i<al1.size();i++){
        //     System.out.print(al1.get(i) + " ");
        // }
        for (Integer integer : al1) {
            System.out.print(integer + " ");
            
        }
        
    }
}
